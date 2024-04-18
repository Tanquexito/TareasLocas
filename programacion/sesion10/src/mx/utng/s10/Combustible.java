package mx.utng.s10;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;



    

public Combustible() {
    }
    //
    public Combustible(short litrosMaximos, short litrosActuales) {
        this.litrosMaximos = litrosMaximos;
        this.litrosActuales = litrosActuales;
    }
    //
    public short getLitrosMaximos() {
        return litrosMaximos;
    }
    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }
    public short getLitrosActuales() {
        return litrosActuales;
    }
    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }



    public void usar(){
        litrosActuales--;
        System.out.println("Quedan: "+litrosActuales+" litros");
    }


    @Override
    public boolean equals(Object obj) {

        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;

        Combustible that=(Combustible)obj;

        if (litrosMaximos!=that.litrosMaximos) return false;

        return litrosActuales==that.litrosActuales;

        
        
        
    }


}
