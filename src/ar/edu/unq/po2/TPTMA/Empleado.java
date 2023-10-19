package ar.edu.unq.po2.TPTMA;

public abstract class Empleado {
	
	public Empleado() {
	}

	public final double sueldo() {
		double sueldo = this.sueldoBasico() * this.porcentajeDeAportesYObraSocial() + this.dineroPorHoras() + this.dineroPorSituacionFamiliar();
		return sueldo;
	}

	protected abstract double sueldoBasico();

	private double porcentajeDeAportesYObraSocial() {
		return 0.87;
	}
	
	protected abstract int dineroPorSituacionFamiliar();

	protected abstract int dineroPorHoras();

}
