package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	protected String mesDePercepcion;
	protected String concepto;
	protected double montoPercibido;

	public Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public double getMontoImponible() {
		return montoPercibido;
	}
}
