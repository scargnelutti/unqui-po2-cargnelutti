package ar.edu.unq.po2.TPStreamsEnums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TPStreamsEnums.LesionesDermatologicas.Lesiones;

class LesionesDermatologicasTest {

	private Lesiones lesion;
	
	@BeforeEach
	void setUp() throws Exception {
		lesion = Lesiones.MIEL;
	}

	@Test
	void testSiguiente() {
		assertEquals(lesion.getSiguiente(), Lesiones.ROJO);
	}

}
