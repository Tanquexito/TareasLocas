package mx.utng.s14.Ej1;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
    private LocalDate fechaTerminacion;

    public ProfesorInterino(String nombre, String apellidos, String idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }
@Override
public void vivir() {
    
    super.vivir();
    System.out.println("Como foraneo.");
}
public void setFechaTerminacion(LocalDate fechaTerminacion) {
    this.fechaTerminacion = fechaTerminacion;
}
public LocalDate getFechaTerminacion() {
    return fechaTerminacion;
}

@Override
public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Desempleado a partir de "+fechaTerminacion);
}
    
    
}
