package ar.curso.escuela.conce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class ConcesionariaService {
	
	public ArrayList<Auto> getListaAutos(){
        ArrayList<Auto> regLista = new ArrayList<>();
        HashMap<Integer,Auto> regService = ConsecionariaBase.getTabla();
        Set<Integer> keys = regService.keySet();
        for (Integer key : keys) 
            regLista.add(regService.get(key));
        return regLista;
    }

    public void setVehiculo(Auto nuevo){
    	ConsecionariaBase.setAuto(nuevo);
    }

    public ArrayList<Auto> getListaModelo(String modelo){
        
        ArrayList<Auto> regLista = new ArrayList<>();
        HashMap<Integer,Auto> regService = ConsecionariaBase.getTabla();
        Set<Integer> keys = regService.keySet();
        
        for (Integer key : keys) {
            if(regService.get(key).getModelo().equals(modelo))
                regLista.add(regService.get(key));
        }
        if (regLista.size() == 0)
            return null;

        return regLista;
    }


}
