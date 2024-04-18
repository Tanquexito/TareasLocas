package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PartidoRepositoryTest {

    @Autowired
    private EquipoRepository repository;
    @Autowired
    private PartidoRepository repository2;

    @BeforeAll
    void cleanDataBase(){
        repository2.deleteAll();
    }

    @Test
    void  canSave(){
        //instancio un equipo
        Equipo equipo1=new Equipo();
        Equipo equipo2=new Equipo();
        equipo1.setNombre("Mexico");
        equipo2.setNombre("paris");

        repository.save(equipo1);
        repository.save(equipo2);

        Partido partido =new Partido();
        partido.setMarcadorEquip1(10);
        partido.setMarcadorEquip2(8);
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);

        repository2.save(partido);
        //guardo
        partido=repository2.save(partido);
        //prueba que exista un id en ese equipo guardado
        assertNotNull(partido.getId());
        assertNotEquals(0,partido.getId());
    }
}
