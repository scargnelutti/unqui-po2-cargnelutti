package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private int porcentajeDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean precioCuidado, int porcentajeDescuento) {
		super(nombre, precio, precioCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public ProductoPrimeraNecesidad(String nombre, Double precio, int porcentajeDescuento) {
		super(nombre, precio);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	@Override
	public Double getPrecio() {
		return this.precio * (1.0 - (porcentajeDescuento / 100.0));
	}
}
