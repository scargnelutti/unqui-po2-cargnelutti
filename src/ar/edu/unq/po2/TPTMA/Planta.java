package ar.edu.unq.po2.TPTMA;

public class Planta extends Empleado {

	private int cantidadDeHijos;
	
	public Planta() {
	}

	@Override
	protected int dineroPorSituacionFamiliar() {
		return this.cantidadDeHijos * 150;
	}

	@Override
	protected int dineroPorHoras() {
		return 0;
	}

	@Override
	protected double sueldoBasico() {
		return 3000;
	}

}
