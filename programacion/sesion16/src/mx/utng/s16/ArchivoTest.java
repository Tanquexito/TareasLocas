package mx.utng.s16;

import java.io.File;
import java.io.IOException;

public class ArchivoTest {
    public static void main(String[] args) throws IOException {
        File archivo=new File("C:/temp/cursos/cursos.txt");
        //consultar el nombre,ruta,directorio padre,si esta oculto
        //si existe
        System.out.println("Nombre del archivo "+archivo.getName());
        System.out.println("Ruta "+ archivo.getPath());
        System.out.println("Ruta absoluta "+archivo.getAbsolutePath());
        System.out.println("otro"+archivo.getCanonicalPath());
        System.out.println("Directorio: "+archivo.getParent());
        System.out.println("Existe "+(archivo.exists()?"si":"no"));
        System.out.println("Es oculto: " +(archivo.isHidden()?"Si":"No"));

        //Tienes permiso de lectura
        System.out.println("Permisos de escritura: "+(archivo.canWrite()?"Si":"No"));
        System.out.println("Permisos de escritura: "+(archivo.canWrite()?"Si":"No"));   
        System.out.println("Permisos de ejecutar:" +(archivo.canExecute()?"Si":"No"));
        System.out.println("Es directorio: "+(archivo.isDirectory()?"Si":"No"));
        System.out.println("El tamaño es de : "+archivo.length()/1024.0+" Kilobytes");

    }
}

