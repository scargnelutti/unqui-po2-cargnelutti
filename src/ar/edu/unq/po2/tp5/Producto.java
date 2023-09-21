package ar.edu.unq.po2.tp5;

public class Producto {
	
	protected String nombre;
	protected double precio;
	protected int stock;
	
	public Producto(String nombre, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getStock() {
		return stock;
	}

	public void decrementarStock() {
		stock = stock - 1;
	}
}
