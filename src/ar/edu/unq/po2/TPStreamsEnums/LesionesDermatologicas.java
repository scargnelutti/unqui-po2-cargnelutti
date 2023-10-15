package ar.edu.unq.po2.TPStreamsEnums;


public class LesionesDermatologicas {
	
	
	public enum Lesiones {
		
		ROJO("Muy grave", 4, "GRIS"), GRIS("Grave", 3, "AMARILLO"),
		AMARILLO("Leve", 2, "MIEL"), MIEL("Sin riesgo", 1, "ROJO");
	
		private String descripcion;
		private int nivelDeRiesgo;
		private String siguiente;
		
		private Lesiones(String descripcion, int nivelDeRiesgo, String siguiente) {
			this.descripcion = descripcion;
			this.nivelDeRiesgo = nivelDeRiesgo;
			this.siguiente = siguiente;
		}
	
		public Lesiones getSiguiente() {
			return Lesiones.valueOf(this.siguiente);
		}
		
	}
	
	
}
