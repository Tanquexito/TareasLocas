import mx.utng.session03.Autor;
import mx.utng.session03.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor =new Autor();
        autor.setNombre("Samael");
        autor.setApellido("Aguayo");
        autor.setEdad(18);

        Libro libro=new Libro();
        libro.setTitulo("Cuchurrumin");
        libro.setAutor(autor);
        libro.setAnio(2020);
        libro.setNumPaginas(266);

        System.out.println("Libro: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor().getNombre()+" "+libro.getAutor().getApellido());
        System.out.println("Numero de paginas: "+libro.getNumPaginas());
    }
}
//carlos samael aguayo santana gds0622