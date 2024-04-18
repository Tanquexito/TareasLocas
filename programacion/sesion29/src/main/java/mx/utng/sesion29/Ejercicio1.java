package mx.utng.sesion29;

import java.util.function.Function;

public class Ejercicio1 {


    //private final StringToInteger parser =5 -> Integer.parseInt(s);
    private final Function<String, Integer> parser=Integer ::parseInt;

/*private final StringToInteger parser= new StringToInteger(){
        public Integer convertir(String s){
            return Integer.parseInt(s);
        }
    }; */
    
    Integer sumar(String a, String b){
        return parser.apply(a)+parser.apply(b);
    }
    
}
