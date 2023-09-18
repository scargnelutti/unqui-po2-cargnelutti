package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaDelMercadoCentral implements Agencia {
	
	private List<Producto> productosEnFila;
	private double montoAPagar;
	
	public double getMontoAPagar() {
		// Se reinician los atributos para dejarlos preparados para el siguiente cliente
		double montoTotal = montoAPagar;
		productosEnFila.clear();
		montoAPagar = 0.00;
		return montoTotal;
	}

	public CajaDelMercadoCentral() {
		super();
		this.productosEnFila = new ArrayList<Producto>();
		this.montoAPagar = 0.00;
	}
	
	public void registrarProducto(Producto unProducto) {
		this.montoAPagar = this.montoAPagar + unProducto.getPrecio();
		this.productosEnFila.remove(unProducto);
		this.decrementarStockDe(unProducto);
	}

	public void decrementarStockDe(Producto unProducto) {
		unProducto.decrementarStock();
	}

	public void ponerProductoEnFila(Producto unProducto) {
		this.productosEnFila.add(unProducto);
	}

	public List<Producto> getProductosEnFila() {
		return productosEnFila;
	}


	@Override
	public void registrarPago(Factura factura) {
		
		
	}
	
}
