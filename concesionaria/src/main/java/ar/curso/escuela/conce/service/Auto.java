package ar.curso.escuela.conce.service;

public class Auto{
	
	private String marca;
	private String modelo;
	private int precio;
	
	public Auto(){}
	
	public Auto(String modeloAuto){
        this.modelo = modeloAuto;
    }
	public Auto( String marcaAuto,String modeloAuto, int precioAuto) {
		 	this.marca = marcaAuto;
	        this.modelo = modeloAuto;
	        this.precio = precioAuto;
	}
	public void setMarca(String marcaAuto){
        this.marca = marcaAuto;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modeloAuto){
        this.modelo = modeloAuto;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setPrecio(int precioAuto){
        this.precio = precioAuto;
    }
    public int getPrecio(){
        return this.precio;
    }

	
	
}
