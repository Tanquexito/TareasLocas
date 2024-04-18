package mx.utng.sesion19;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        int numero=40;
        String binario=Integer.toBinaryString(numero);
        System.out.printf("El numero %d es en binario %s%n",numero,binario);
        Scanner leoyo=new Scanner(System.in);
        System.out.println("escribe un numero para convertir a binario");
        numero=leoyo.nextInt();
        String binario2=Integer.toBinaryString(numero);
        System.out.printf("El numero %d es en binario %s%n",numero,binario2);

    }
}
