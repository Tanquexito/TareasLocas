package mx.utng.s09;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;



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


    


}
