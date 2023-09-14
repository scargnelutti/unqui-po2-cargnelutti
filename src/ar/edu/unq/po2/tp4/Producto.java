package ar.edu.unq.po2.tp4;

public class Producto {
	
	protected String nombre;
	protected Double precio;
	protected boolean precioCuidado;
	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
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
	
	public void aumentarPrecio(Double unPrecio) {
		this.precio = this.precio + unPrecio;
	}
	
}
