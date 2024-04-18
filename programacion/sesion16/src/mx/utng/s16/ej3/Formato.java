package mx.utng.s16.ej3;

import java.time.LocalDate;

public class Formato {
    public static void main(String[] args) {
        final String NOMBRE="Bobby";
        final int EDAD=3;
        final float ESTATURA=30.5f;
        final LocalDate FECHA_NACIMIENTO=LocalDate.of(2020, 8, 13);
        System.out.println("El nombre de mi mascota es: "+NOMBRE+" tiene una edad de: "+EDAD+" su estatura es: "+ESTATURA+" Nacio en "+FECHA_NACIMIENTO);

        System.out.printf("El nombre de mi mascota es: %s tiene una edad de: %d su estatura es: %f Nacio el dia %4$te del mes %4$tb del año %4ty %n", NOMBRE,EDAD,ESTATURA,FECHA_NACIMIENTO);
    }
    
}
