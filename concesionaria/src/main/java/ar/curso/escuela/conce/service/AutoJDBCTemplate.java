package ar.curso.escuela.conce.service;

import java.util.List;

import javax.sql.DataSource;

public class AutoJDBCTemplate implements AutoDao{
	
	private DataSource dataSource;
	   private ConsecionariaBase jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new ConsecionariaBase(dataSource);
	   }
	   public List<Auto> listaDeAutos() {
	      String SQL = "select * from Student";
	      List <Auto> students = jdbcTemplateObject.query(SQL, new AutoRowMapper());
	      return students;
	   }
	@Override
	public List<Auto> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
