package mx.utng.s14.Ej1;

public  abstract class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;

    }
    public void mostrarDatos(){
        System.out.printf("Persona: %nNombre: %s%nApellidos: %s%n ",nombre,apellidos );
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void vivir();
    //LOS METODOS ABSTRACTOS NO TIENE CUERPO
    
}
