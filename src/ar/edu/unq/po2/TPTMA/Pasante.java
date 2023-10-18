package ar.edu.unq.po2.TPTMA;

public class Pasante extends Empleado {

	private int horasTrabajadasEnElMes;
	
	public Pasante() {
	}

	@Override
	protected int dineroPorSituacionFamiliar() {
		return 0;
	}

	@Override
	protected int dineroPorHoras() {
		return this.horasTrabajadasEnElMes * 40; 
	}

	@Override
	protected double sueldoBasico() {
		return 0;
	}

}
