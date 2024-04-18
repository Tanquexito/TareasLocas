package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class EquipoRepositoryTest {

    @Autowired
    private EquipoRepository repository;

    @BeforeAll
    void cleanDataBase(){
        repository.deleteAll();
    }

    @Test
    void  canSave(){
        //instancio un equipo
        Equipo equipo =new Equipo();
        equipo.setNombre("America");

        //guardo
        equipo=repository.save(equipo);
        //prueba que exista un id en ese equipo guardado
        assertNotEquals(0,equipo.getId());
    }

    @Test
    @DisplayName("Buscar Por Nombre")
    void canFindByName(){
        String name="Chivas";
        Equipo equipo=new Equipo();
        equipo.setNombre(name);
        repository.save(equipo);
        Iterable<Equipo> ListaEquipos=repository.findAllByNombre(name);
        assertTrue(ListaEquipos.iterator().hasNext());

        Equipo equipoEncontrado= ListaEquipos.iterator().next();
        assertEquals(equipo, equipoEncontrado);
    }

}
