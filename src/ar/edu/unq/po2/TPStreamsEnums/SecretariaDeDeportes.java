package ar.edu.unq.po2.TPStreamsEnums;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SecretariaDeDeportes {

	private List<ActividadSemanal> actividades;
	
	public SecretariaDeDeportes() {
		super();
		this.actividades = new ArrayList<ActividadSemanal>();
	}

	public List<ActividadSemanal> actividadesDeFutbol() {
		Stream<ActividadSemanal> resultado = this.actividades.stream().filter(actividad -> actividad.getDeporte().equals(Deporte.FUTBOL));
		return resultado.toList();
	}
	
	public List<ActividadSemanal> actividadesConComplejidad(int complejidad) {
		Stream<ActividadSemanal> resultado = this.actividades.stream().filter(actividad -> actividad.getComplejidad() == complejidad);
		return resultado.toList();
	}

	public int totalDeHorasDeActividades() {
		int totalDeHoras = this.actividades.stream().mapToInt(actividad -> actividad.getDuracion()).sum();
		return totalDeHoras;
	}
	
	public Stream<ActividadSemanal> actividadDeMenorCostoParaDeporte(Deporte unDeporte) {
		Stream<ActividadSemanal> actividadBuscada = this.actividades.stream()
				.filter(actividad -> actividad.getDeporte().equals(unDeporte))
				;
		return actividadBuscada;
	}
	
	public void agregarActividad(ActividadSemanal unaActividad) {
		this.actividades.add(unaActividad);
	}

	public void imprimirActividades() {
		this.actividades.stream().forEach(actividad -> System.out.print(actividad.toString()));
	}
}
