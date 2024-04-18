package mx.utng.s10;


import java.util.Arrays;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int kilometraje;
    private Llanta[] llantas=new Llanta[4];
    private Combustible combustible=new Combustible();

    //


    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode(){
        int hash=0;
        hash+=marca.hashCode();
        hash+=modelo.hashCode();
        hash+=anioFabricacion;
        hash+=kilometraje;
        return hash;
    }


    public void colocaLlantas(Llanta delanteraIzq,Llanta delanteraDer,Llanta traseraIzq,Llanta traseraDer){
        llantas[0]=delanteraIzq;
        llantas[1]=delanteraDer;
        llantas[2]=traseraIzq;
        llantas[3]=traseraDer;

    }
    public void llenaTanque(){
        combustible.setLitrosActuales(combustible.getLitrosMaximos());

    }

    public void avanzar(){
        if (combustible.getLitrosActuales()>0) {
            for(Llanta llanta : llantas){
                llanta.rodar();
            }
            combustible.usar();
        }else{
            System.out.println("No hay combustible");
        }

    }

    public void setCombustible(Combustible combustible){
        this.combustible=combustible;

    }

    




    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje, Llanta[] llantas,
            Combustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.llantas = llantas;
        this.combustible = combustible;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this==obj) return true;
        if (obj==null||getClass() != obj.getClass()) return false;

        Automovil that=(Automovil)obj;
         if(!that.marca.equals(this.marca)) return false;
         if(!that.modelo.equals(this.modelo)) return false;
         if(that.anioFabricacion!=this.anioFabricacion) return false;
         if(that.kilometraje!=this.anioFabricacion) return false;
         if(!Arrays.equals(that.llantas, this.llantas)) return false;

         return that.combustible.equals(this.combustible);



    }
}
