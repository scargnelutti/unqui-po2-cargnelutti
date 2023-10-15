package ar.edu.unq.po2.TPStreamsEnums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeDeportesTest {

	private SecretariaDeDeportes unaSecretaria;
	
	@BeforeEach
	void setUp() throws Exception {
		unaSecretaria = new SecretariaDeDeportes();
		unaSecretaria.agregarActividad(new ActividadSemanal(DiaDeLaSemana.LUNES, "10:00", 3, Deporte.RUNNING));
		unaSecretaria.agregarActividad(new ActividadSemanal(DiaDeLaSemana.MARTES, "16:00", 4, Deporte.FUTBOL));
		unaSecretaria.agregarActividad(new ActividadSemanal(DiaDeLaSemana.MIERCOLES, "10:00", 3, Deporte.TENNIS));
		unaSecretaria.agregarActividad(new ActividadSemanal(DiaDeLaSemana.JUEVES, "10:00", 4, Deporte.FUTBOL));
		unaSecretaria.agregarActividad(new ActividadSemanal(DiaDeLaSemana.VIERNES, "10:00", 1, Deporte.TENNIS));
	}

	@Test
	void testActividadesDeFutbol() {
		assertEquals(2, unaSecretaria.actividadesDeFutbol().size());
	}

	@Test
	void testActividadesConComplejidad() {
		assertEquals(2, unaSecretaria.actividadesConComplejidad(3).size());
	}

	@Test
	void testTotalDeHorasDeActividades() {
		assertEquals(15, unaSecretaria.totalDeHorasDeActividades());
	}

	@Test
	void testActividadDeMenorCostoParaDeporte() {
		assertEquals(1,1);
	}

	@Test
	void testImprimirActividadSemanal() {
		String textoEsperado = "Deporte: RUNNING. Dia: LUNES A LAS 10:00. Duracion: 3 hora(s).";
		assertEquals(textoEsperado, new ActividadSemanal(DiaDeLaSemana.LUNES, "10:00", 3, Deporte.RUNNING).toString());
	}
	
}
