package ar.edu.unq.po2.ClaseStreams;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

	private String nombre;
	private String direccion;
	private List<Producto> platos;
	
	protected Restaurante(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.platos = new ArrayList<Producto>();
	}

	public double sumarMontosConIvaMenoresA2000() {
		return platos.stream().filter(p->(p.getPrecioConIva()) < 2000)
		.mapToDouble(p->p.getPrecioConIva())
		.sum();
	}

	public void añadirProducto(Producto producto) {
		this.platos.add(producto);
		
	}
}
