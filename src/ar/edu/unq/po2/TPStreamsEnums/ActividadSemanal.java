package ar.edu.unq.po2.TPStreamsEnums;

public class ActividadSemanal implements Comparable<ActividadSemanal> {
	
	private DiaDeLaSemana dia;
	private String horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, String horaDeInicio, int duracion, Deporte deporte) {
		super();
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public Deporte getDeporte() {
		return this.deporte;
	}

	public int getComplejidad() {
		return this.deporte.getComplejidad();
	}

	public int getDuracion() {
		return this.duracion;
	}
	
	/*
	 * El costo de la actividadSemanal se rige por el siguiente algoritmo: 
	 * De lunes a miércoles la hora cuesta 500 pesos
	 * De jueves a domingos 1000 pesos
	 * . Cada punto de complejidad agrega 200 pesos.
	*/
	// Debo hacer que el dia me retorne el precio por hora. Pero el enumerativo de dia no puede tener comportamiento
	// Quizá un EnumMap me ayude
	public int calcularCosto() {
		int costo = this.getComplejidad() * 200;
		
		return costo;
	}

	@Override
	public int compareTo(ActividadSemanal o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
