package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		super();
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int edadPromedioDeIntegrantes() {
		int result = 0;
		for (Persona integrante: this.integrantes) {
			result = result + integrante.getEdad();
		}
		return result / this.integrantes.size();
	}
}
