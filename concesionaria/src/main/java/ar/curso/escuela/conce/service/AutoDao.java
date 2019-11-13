package ar.curso.escuela.conce.service;

import java.util.List;

import javax.sql.DataSource;

public interface AutoDao {
	
	public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to list down
	      * all the records from the Student table.
	   */
	   public List<Auto> listStudents();   
	

}
