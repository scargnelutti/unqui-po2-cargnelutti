package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private Double precio;
	private boolean precioCuidado;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public boolean esPreciosCuidados() {
		return precioCuidado;
	}
	
	public void setPreciosCuidados(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	public Producto(String nombre, Double precio, boolean precioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}
	
	public Producto(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = false;
	}
}
