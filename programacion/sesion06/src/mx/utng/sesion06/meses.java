package mx.utng.sesion06;

import java.util.Scanner;

public class meses {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Teclea un mes: ");

        String mesActual=scanner.nextLine().toLowerCase();
        

        switch (mesActual) {
            case "enero":
                System.out.print(", Febero");
            case "febrero":
                System.out.print(", Marzo");
            case "marzo":
                System.out.print(", Abril");
            case "abirl":
                System.out.print(", Mayo");
            case "mayo":
                System.out.print(", Junio");
            case "junio":
                System.out.print(", Julio");
            case "julio":
                System.out.print(", Agosto");
            case "agosto":
                System.out.print(", septiembre");
            case "septiembre":
                System.out.print(", octubre");
            case "actubre":
                System.out.print(", Noviembre");
             case "noviembre":
                System.out.print(", Diciembre");
               break;
            
            
        
            default: System.out.println("Ingresa un mes valido");
                break;
        }
    }
    
}
