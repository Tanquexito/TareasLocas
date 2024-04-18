package mx.utng.s10;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador cont1 =new Contador();
        Contador cont2 =new Contador();
        Contador cont3 =new Contador();
        Contador cont4 =new Contador();
        Contador cont5=new Contador();

        cont1.setContadorInstancia((short)20);
        cont2.setContadorInstancia((short)22);
        cont3.setContadorInstancia((short)25);
        cont4.setContadorInstancia((short)30);
        cont5.setContadorInstancia((short)40);

        System.out.println("Contador 1 contadorClase "+cont1.getContadorClase());
        System.out.println("contador 1, contadorInstancia: "+cont1.getContadorInstancia());

        System.out.println("Contador 2 contadorClase "+cont2.getContadorClase());
        System.out.println("contador 2, contadorInstancia: "+cont2.getContadorInstancia());
        System.out.println("Contador 3 contadorClase "+cont3.getContadorClase());
        System.out.println("contador 3, contadorInstancia: "+cont3.getContadorInstancia());
        System.out.println("Contador 4 contadorClase "+cont4.getContadorClase());
        System.out.println("contador 4, contadorInstancia: "+cont4.getContadorInstancia());
    }
}
