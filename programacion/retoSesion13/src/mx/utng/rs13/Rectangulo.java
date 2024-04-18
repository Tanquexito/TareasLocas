package mx.utng.rs13;
/**
 * @author Carlos Samael
 * @since 07/02/2024
 * @category GDS0622
 */
public class Rectangulo implements Figura{
    private double base;
    private double altura;

    @Override
    public void CalcularArea() {
        System.out.println("El area del cuadrado es: "+ base*altura);
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
}
