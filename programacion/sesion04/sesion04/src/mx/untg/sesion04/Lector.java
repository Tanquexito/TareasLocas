package mx.untg.sesion04;

import java.util.Scanner;

public class Lector {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        /* 
        //crear un lector de valoes desde la terminal 
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe tu  nombre: ");
        //lea lo que se escribio 
        String nombre=lector.nextLine();
        System.out.println("Hola "+nombre);

    //para poner este alt + el que sigue del 0
        //interpolacio
        int edad=18;
        boolean casado=true;
        System.out.printf("Hola soy %s y tengo %d años y %s casado   \n",nombre, edad, casado==true?"soy":"No soy");
        */
    }

    //metodo muestra una cadena dada como parametro
    public void muestraMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    //leer a partir del escanner
    public String leerEntrada(){
        return scanner.nextLine();
    }

}