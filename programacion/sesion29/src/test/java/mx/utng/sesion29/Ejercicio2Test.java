package mx.utng.sesion29;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    private final List<Integer> CONJUNTO =Arrays.asList(1,4,2,-7,9);

    @Test
    @DisplayName("Negativos")
    void negatives(){
        Ejercicio2 ejercicio2= new Ejercicio2();
        List<Integer> real=ejercicio2.transformar(CONJUNTO, s-> -s);

        assertThat(real).containsExactly(-1,-4,-2,7,-9);
    }

    @Test
    @DisplayName("Cuadrados")
    void squares(){
        Ejercicio2 ejercicio2=new Ejercicio2();
        List<Integer> real=ejercicio2.transformar(CONJUNTO, s->s*s);
        assertThat(real).containsExactly(1,16,4,49,81);
    }

    @Test
    @DisplayName("Acumulador")
    void 
}
