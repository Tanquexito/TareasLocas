package mx.utng.mx.s18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;

public class Binarios {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //manejador de entrada de archivos
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\SAMAEL\\OneDrive\\Documentos\\Utng\\2do cuatri\\programacion\\sesion18\\src\\mx\\utng\\mx\\s18\\picmix.com_1452811.png"));

        //archivo de salida
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\SAMAEL\\OneDrive\\Documentos\\Utng\\2do cuatri\\programacion\\sesion18\\src\\mx\\utng\\mx\\s18\\copia_picmix.com_1452811.png"));
   
        //Comenzar copia 
        byte[] buffer =new byte [4096];
        int bytesLeidos=0;
        
        while ((bytesLeidos=bis.read(buffer))>0) {
            bos.write(buffer,0,bytesLeidos);
        }

        bis.close();
        bos.close();
   
    }
}
