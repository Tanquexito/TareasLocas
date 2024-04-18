package mx.utng.sesion20;

public class Ciudadano {
    public static void main(String[] args) {
        Gobierno gobierno= Gobierno.getGobierno();
        
        gobierno.darApoyo();
        Gobierno pseudoOtro=Gobierno.getGobierno();
        pseudoOtro.darApoyo();
        
    }
    
}
