package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	// La capacidad del arreglo puede ser un problema
	private ArrayList<Ingreso> ingresoAnual;
	
	public Trabajador(ArrayList<Ingreso> ingresoAnual) {
		super();
		this.ingresoAnual = ingresoAnual;
	}

	public double getTotalPercibido() {
		// retornar el monto total percibido por el trabajador
		double totalPercibido = 0;
		for (Ingreso ingreso: ingresoAnual) {
			totalPercibido = totalPercibido + ingreso.getMontoPercibido();
		}
		return totalPercibido;
	}
	
	public double getMontoImponible() {
		// retornar el monto imponible al impuesto al trabajador
		double montoImponible = 0;
		for (Ingreso ingreso: this.ingresoAnual) {
			montoImponible = montoImponible + ingreso.getMontoImponible();
		}
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		// retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
		return this.getMontoImponible() * 0.02;
	}
}
