package mx.utng.sesion05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        String  mensaje;
        //definir objeto scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("Teclea tu calificacion");
        int calificicacion=scanner.nextInt();
         switch (calificicacion) {
            case 10:
            mensaje=("Calificacion exelente");
                
                break;
            case 9:
            mensaje=("Muy bien");
            break;

            case 8:
            System.out.println("Bien");
            break;
            case 7:
            System.out.println("Regular");
            break;
            case 6:
            System.out.println("Pansaste");
            break;
            case 5:
            System.out.println("Menso Intenta de nuevo");
            break;
         
            default: System.out.println("Calificacion invalida");
                break;
         }
        

    }
    
}
