package mx.utng.s16.ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Texto {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter(System.getProperty("user.home")+"/archivo.txt");
        System.out.println(fileWriter);

        BufferedWriter bw= new BufferedWriter(fileWriter);
        bw.write("Esta linea se escribira el archivo");
        bw.newLine();
        bw.write("Esta es una seguna linea");
        bw.newLine();
        bw.write("Esta es la ultima linea");
        bw.write("\nFeliz 14 febrero es hoy ");
        bw.close();

        BufferedReader br=new BufferedReader(new FileReader(System.getProperty("user.home")+"/archivo.txt"));

        //leer el archivo todo
        String linea=null;
        while ((linea=br.readLine())!=null){
            System.out.println(linea);
        }

    }
    
}
