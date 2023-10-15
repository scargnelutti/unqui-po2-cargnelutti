package ar.edu.unq.po2.ClaseStreams;

public class Producto implements Comparable<Producto>{

	private String nombre;
	private int precio;
	public int compareTo(Producto p) {
		return 0;
	}
	protected Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getPrecio() {
		return this.precio;
	}
	
	public double getPrecioConIva() {
		return this.precio * 1.21;
	}
}
