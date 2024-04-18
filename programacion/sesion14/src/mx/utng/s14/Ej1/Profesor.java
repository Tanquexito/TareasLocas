package mx.utng.s14.Ej1;

public class Profesor extends Persona {
    private String idProfesor;

    public Profesor(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos);
        this.idProfesor = idProfesor;
    }

    @Override
    public void vivir() {
        System.out.println("Vive sin lujos");

    }
    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }
    public String getIdProfesor() {
        return idProfesor;
    }

    @Override
    public void mostrarDatos() {
      
        System.out.printf("Profesor: %s%n ", idProfesor);
        super.mostrarDatos();
    }

    
    

    
}
