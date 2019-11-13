package ar.curso.escuela.conce.service;

import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.tree.RowMapper;

public class AutoRowMapper implements RowMapper<Auto>{
	
	public Auto mapRow(ResultSet resultSet, int i) throws SQLException {
	 	Auto auto = new Auto();
	 	auto.setMarca(resultSet.getString("MARCA"));
	 	auto.setModelo(resultSet.getString("MODELO"));
	 	auto.setPrecio(resultSet.getInt("PRECIO"));
        return  auto;
    }

}
