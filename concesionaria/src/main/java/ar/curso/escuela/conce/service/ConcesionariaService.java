package ar.curso.escuela.conce.service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.sql.ResultSet;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcesionariaService {
	
	@Autowired
    ConsecionariaBase consesionariaBase;


    public  List<Auto> getAirlines(){

        String sql="select * from AUTO";
        List<Auto> query = consesionariaBase.query(sql, new AutoRowMapper());
        query.forEach(item->System.out.println(item.getAirlineNameShort()));
        return query;
    }

	
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
