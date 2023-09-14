package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantidadDeHorasExtras;
	
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido, int cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	
	public int getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}

	@Override
	public double getMontoImponible() {
		return 0;
	}
}
