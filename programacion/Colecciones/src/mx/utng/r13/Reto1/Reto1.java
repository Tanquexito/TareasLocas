package mx.utng.r13.Reto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author Carlos Samael
 * @category GDS0622
 * @since 10-02-24
 */

public class Reto1 {
    public static void main(String[] args) {
        // se crea la lista
        List<String> frutas=new ArrayList<>();
        //Agregamos los valores dentro de esta
        Collections.addAll(frutas, "Platanos","Sandia","Pera","Manzana","Naranja","Kiwi");
        System.out.println(frutas);


        //Invertimos El orden con la funcion reverse de la clase collection
        Collections.reverse(frutas);
        System.out.println(frutas);

        //Elemento mas pequeño analfabeticamente
        System.out.println("El mas pequeño analfabeticamente es: "+Collections.min(frutas));

        //Elemento mas grande analfabeticamente
        System.out.println("El mas grande analfabeticamente es: "+Collections.max(frutas));

        //segunda parte

        //ordenar alfabeticamente
        Collections.sort(frutas);
        System.out.println("Ordenadas "+frutas);

        //Posiccion de la lista pera y naranja

        System.out.println("La pera se encuentra en la posicion: "+(Collections.binarySearch(frutas, "Pera")+1));
        System.out.println("La naranja se encuentra en la posicion: "+(Collections.binarySearch(frutas, "Naranja")+1));

        //Agregar 3 manzanas nuevas
        Collections.addAll(frutas, "Manzana","Manzana","Manzana");
        System.out.println(frutas);
        //desordenar los elementos
        Collections.shuffle(frutas);
        System.out.println("Desordenadas "+frutas);
        //num de manzanas en la lista
        System.out.println("Hay "+Collections.frequency(frutas, "Manzana")+" Manzana en la lista");




    }
}
