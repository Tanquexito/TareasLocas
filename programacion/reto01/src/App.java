import java.time.LocalDate;

import mx.utng.reto.DBA;
import mx.utng.reto.Empleado;
import mx.utng.reto.Persona;
import mx.utng.reto.Programador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Programador pro=new Programador("Profe tachito", (byte) 28, LocalDate.of(1996, 1, 15), 16000, "Java ");
        System.out.println("programador: "+ pro.getNombre()+" Edad: " +pro.getEdad()+" Fecha de nacimiento: " +pro.getFechaNacimiento()+ " Salario: "+ pro.getSalario()+" Lenguaje preferido: "+pro.getLenguajePrincipal() );
        
        DBA dva1=new DBA("satami", (byte)15, LocalDate.of(2007, 06, 15), 1300, "Sql");
        System.out.println("DBA: "+ dva1.getNombre()+" Edad: " +dva1.getEdad()+" Fecha de nacimiento: " +dva1.getFechaNacimiento()+ " Salario: "+ dva1.getSalario()+" Herramienta de consulta: "+dva1.getHerramientaConsultas() );
        

        
    }
}
