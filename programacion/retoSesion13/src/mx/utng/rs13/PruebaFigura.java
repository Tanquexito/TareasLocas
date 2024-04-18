package mx.utng.rs13;

/**
 * @author Carlos Samael
 * @since 07/02/2024
 * @category GDS0622
 */

public class PruebaFigura {
    public static void main(String[] args) {
        Figura figura;
        figura= new Triangulo(3,5);
        figura.CalcularArea();
        System.out.println(figura instanceof Triangulo);

        figura= new Rectangulo(10,5);
        figura.CalcularArea();
        System.out.println(figura instanceof Rectangulo);

        figura = new Cuadrado(8);
        figura.CalcularArea();
        System.out.println(figura instanceof Cuadrado);



        


    }
    
}
