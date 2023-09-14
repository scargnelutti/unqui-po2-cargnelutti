package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipoDeTrabajo;
	private ArrayList<Persona> integrantes;
	
	@BeforeEach
	void setUp() throws Exception {
		integrantes = new ArrayList<Persona>();
		integrantes.add(new Persona("Alberto", "Fernandez", 20));
		integrantes.add(new Persona("Cristina", "Fernandez", 30));
		integrantes.add(new Persona("Sergio", "Massa", 40));
		integrantes.add(new Persona("Javier", "Milei", 50));
		integrantes.add(new Persona("Alberto", "Samid", 60));
		
		equipoDeTrabajo = new EquipoDeTrabajo("Objetos", integrantes);
	}

	@Test
	void testEdadPromedioDeIntegrantes() {
		int resultado = equipoDeTrabajo.edadPromedioDeIntegrantes();
		System.out.print(resultado);
		assertEquals(40, resultado);
	}
	
	@Test
	void testGetNombre() {
		assertEquals("Objetos", equipoDeTrabajo.getNombre());
	}
	
}
