package mx.utng.s14.Ej1;

import java.time.LocalDate;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor profe1=new Profesor("El TAchito locochon", "Developer de java", "UTNG0066600");
        profe1.vivir();
        profe1.mostrarDatos();

        Profesor profe2= new ProfesorInterino("MEmo", "Basiologo", "UTNG12345",LocalDate.of(2024, 12, 21));
        profe2.mostrarDatos();
        profe2.vivir();
    }
    
}
