
import mx.utng.s07.Lector;
import mx.utng.s07.ListaTarea;
import mx.utng.s07.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Menu menu=new Menu();
        Lector lector=new Lector();
        ListaTarea lista=new ListaTarea();

        byte opcionSeleccionada=0;


        do {
            menu.muestraOpciones();//muestra opciones
            opcionSeleccionada=lector.leeOpcion();//lee la opcion elegida

            System.out.println("\n\n La opcion seleccionada es: "+opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1: lista.crearListaTarea();
                    
                    break;
                case 2: lista.verListaTarea();
                    break;

                case 3: lista.verTareaDeLista();
                    break;
                case 4: lista.actualizarListaTarea();
                    break;
                case 5: lista.eliminarListaTarea();
                    break;
                case 6: System.out.println("Saliendo De La Aplicacion... ... ... ");
                break;
            
                default:System.out.println("Ingrese un valor valido menso loco");
                    break;
            }


        } while (opcionSeleccionada!= 6);



    }
}
