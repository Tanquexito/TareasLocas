package mx.utng.sesion20;

public class Gobierno {
    private static Gobierno gobierno;
    private Gobierno(){
        System.out.println("Unica instancia de gobierno");
    }
    public static Gobierno getGobierno() {
        if(gobierno==null){
            gobierno=new Gobierno();
        }
        return gobierno;
    }
    public void darApoyo(){
        System.out.println("Dar apoyo al ciudadano");
    }
}
