package mx.utng.sesion05;

import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe tu calificacion: ");
        int cal=scanner.nextInt();
        scanner.close();

        if (cal==10) {
            System.out.println("Perfecto");
        }else if (cal==9) {
            System.out.println("Muy Bien");
        }else if (cal==8) {
            System.out.println("Bien");
        }else if (cal==7) {
            System.out.println("Regular");
        }else if (cal==6) {
            System.out.println("Pansaste mensillo");
        }else if (cal<=5) {
            System.out.println("Reprobado pongase pilas");
        }else System.out.println("Ingresa un valor valido");


        


    }
    
}
