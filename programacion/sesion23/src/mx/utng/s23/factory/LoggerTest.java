package mx.utng.s23.factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //crear objeto loggerFactory
        LoggerFactory factory=new LoggerFactory();
        //el susuario teclea el tipo
        Scanner scanner =new Scanner(System.in);
        System.out.println("Teclea el tipo de Logger:\n 1=Archivo 2=Consola ");
        int tipo=scanner.nextInt();
        scanner.close();
        //se crea el logger de acuerdo al elegido por el usuario
        Logger logger= factory.getLogger(tipo);
        logger.log("Registro de eventos del sistema");
    }
}
