package mx.utng.s14.Ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas=new ArrayList<>();

        System.out.println(listaCadenas.isEmpty());
        listaCadenas.add("Venado");
        listaCadenas.add("Tren");
        listaCadenas.add("Gato");
        listaCadenas.add("Perro");

        //Impime todos los elementos dentro de corchetes
        System.out.println(listaCadenas);

        System.out.println("++++++ fori +++++++");

        //imprimir cada elemento con salto de linea
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println(listaCadenas.get(i));
            
        }
        System.out.println("***** Foreach ******");

        //Imprime la lista foreach
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
            
        }

        //Uso de conjuntos
        //no admiten valores repetidos

        System.out.println("====== Mostrando un SET =====");

        Set<String> conjuntoCadenas=new HashSet<>();
        conjuntoCadenas.add("Venado");
        conjuntoCadenas.add("Tren");
        conjuntoCadenas.add("Gato");
        conjuntoCadenas.add("Gato");
        conjuntoCadenas.add("Perro");

        for (String cadena : conjuntoCadenas) {
            System.out.println(cadena);
        }

        System.out.println("======== ========");

        List<Numero> numeros=new ArrayList<>();
        numeros.add(new Numero("Uno"));
        numeros.add(new Numero("dos"));
        numeros.add(new Numero("Tres"));
        numeros.add(new Numero("Cuatro"));
        numeros.add(new Numero("Cinco"));
        numeros.add(new Numero("Tres"));

        for (Numero numero : numeros) {
            System.out.println(numero.getNombre());
            
        }
        System.out.println("======== ========");

        Set<Numero> qqq=new HashSet<>();
        qqq.add(new Numero("Uno"));
        qqq.add(new Numero("dos"));
        qqq.add(new Numero("Tres"));
        qqq.add(new Numero("Cuatro"));
        qqq.add(new Numero("Cinco"));
        qqq.add(new Numero("Tres"));

        for (Numero numero : qqq) {
            System.out.println(numero.getNombre());
            
        }


    }
    
}
