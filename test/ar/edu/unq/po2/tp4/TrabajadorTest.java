package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador trabajador;
	
	@BeforeEach
	void setUp() throws Exception {
		ArrayList<Ingreso> ingresoAnual = new ArrayList<Ingreso>();
		ingresoAnual.add(new Ingreso("Enero", "Empleado", 300.0));
		ingresoAnual.add(new Ingreso("Febreo", "Empleado", 300.0));
		ingresoAnual.add(new Ingreso("Marzo", "Empleado", 400.0));
		ingresoAnual.add(new IngresoPorHorasExtras("Enero", "Empleado", 100, 1));
		trabajador = new Trabajador(ingresoAnual);
	}

	@Test
	void testGetTotalPercibido() {
		double totalPercibido = trabajador.getTotalPercibido();
		assertEquals(1100, totalPercibido);
	}
	
	@Test
	void testGetMontoImponible() {
		double montoImponible = trabajador.getMontoImponible();
		assertEquals(1000, montoImponible);
	}
	
	@Test
	void testGetImpuestoAPagar() {
		double impuestoAPagar = trabajador.getImpuestoAPagar();
		assertEquals(20, impuestoAPagar);
	}
}
