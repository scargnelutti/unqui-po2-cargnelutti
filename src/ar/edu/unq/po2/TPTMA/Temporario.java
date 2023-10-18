package ar.edu.unq.po2.TPTMA;

public class Temporario extends Empleado {

	private boolean tieneHijos;
	private boolean estaCasado;
	private int horasTrabajadas;
	
	public Temporario(boolean tieneHijos, boolean estaCasado) {
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}

	@Override
	protected int dineroPorSituacionFamiliar() {
		if (this.tieneHijos || this.estaCasado) {
			return 100;
		}
		return 0;
	}

	@Override
	protected int dineroPorHoras() {
		return this.horasTrabajadas * 5;
	}

	@Override
	protected double sueldoBasico() {
		return 1000;
	}

}
