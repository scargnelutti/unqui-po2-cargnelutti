package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Double getPrecioTotal() {
		Double precioTotal = Double.valueOf(0);
		for (Producto producto: productos) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}
}
