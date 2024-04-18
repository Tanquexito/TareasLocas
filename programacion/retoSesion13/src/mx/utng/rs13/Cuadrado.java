package mx.utng.rs13;
/**
 * @author Carlos Samael
 * @since 07/02/2024
 * @category GDS0622
 */

public class Cuadrado implements Figura {
    private double lado;

    @Override
    public void CalcularArea() {
        System.out.println("El area del cuadrado es:" + lado*lado);
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    

    
}
