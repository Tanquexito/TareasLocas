package mx.utng.s12;

public class Sobrecarga {
    public static void main(String[] args) {
        Equipo equipo1=new Equipo("Gladiadores", "San Felipe", 0);
        Equipo equipo2=new Equipo("CDMX");
        System.out.println(equipo2);
        System.out.println(equipo1);
        equipo2.Actualiza(10);
        equipo2.Actualiza("Vencedores");
        System.out.println(equipo2);
    }
    
}
