package mx.utng.s14.Ej2;

public class Numero {
    private String nombre;

    public Numero(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if(obj==null|| getClass()!=obj.getClass()) return false;
        Numero numero= (Numero)obj;
        return nombre!=null?nombre.equals(numero.getNombre()): numero.nombre==null;

    }
    
    @Override
        public int hashCode(){
            return nombre!=null?nombre.hashCode():0;
        }
    
}
