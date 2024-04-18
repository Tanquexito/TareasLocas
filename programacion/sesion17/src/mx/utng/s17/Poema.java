package mx.utng.s17;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
* @author Carlos SAmael Aguayo Santana
*@category GDS0622
*@since 16 febrero 2024
*/


public class Poema {
    
    public static void main(String[] args)throws IOException {
       
        FileWriter fileWriter=new FileWriter(System.getProperty("user.home")+"/archivo.txt");
        System.out.println(fileWriter);

        BufferedWriter bw= new BufferedWriter(fileWriter);
        bw.write("El dia de hoy quiero comer");
        bw.newLine();
        bw.write("Por eso la invitare a usted");
        bw.newLine();
        bw.write("Aunque ya no nos vemos");
        bw.newLine();
        bw.write("se que los dos nos queremos");
        bw.newLine();
        bw.write("mientras tu te vas");
        bw.newLine();
        bw.write("Yo me acerco cada vez mas");
        bw.newLine();
        bw.write("y asi poder esos ojos mirar");
        bw.newLine();
        bw.write("lamentablemente tu ya miras a alguien mas ");
        bw.newLine();
        bw.write("                        -Samael ");
        
        bw.close();

        BufferedReader br=new BufferedReader(new FileReader(System.getProperty("user.home")+"/archivo.txt"));

        //leer el archivo todo
        String linea=null;
        while ((linea=br.readLine())!=null){
            System.out.println(linea);
        }
        br.close();
    }
}
