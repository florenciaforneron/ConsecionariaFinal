package ar.curso.escuela.conce.service;
import java.util.HashMap;



public class ConsecionariaBase {
	
	private static HashMap<Integer,Auto> miRegistro;
    private static int ultimoId;
    
    static{
        miRegistro = new HashMap<>();
        miRegistro.put(1, new Auto("Audi","a4",200));
        miRegistro.put(2,new Auto("Peugueot","307",219));
        ultimoId = 2;
    }

    public static void setAuto(Auto miAuto){
        ultimoId++;
        miRegistro.put(ultimoId, miAuto);
    }


    public static HashMap<Integer,Auto> getTabla(){
        return miRegistro;
    }

}
