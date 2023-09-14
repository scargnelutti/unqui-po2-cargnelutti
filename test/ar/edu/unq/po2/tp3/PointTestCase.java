package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

	private Point point;
	
	@BeforeEach
	void setUp() throws Exception {
		point = new Point(2, 3);
	}

	@Test
	void testUnPuntoSeInicializaSinParametros() {
		Point puntoSinParametros = new Point();
		assertEquals(0, puntoSinParametros.getX());
		assertEquals(0, puntoSinParametros.getY());
	}
	
	@Test
	void testUnPuntoSeInicializaConParametros() {
		assertEquals(2, point.getX());
		assertEquals(3, point.getY());
	}

	@Test
	void testMoverPuntoA() {
		point.moverPuntoA(3, 4);
		assertEquals(3, point.getX());
		assertEquals(4, point.getY());
	}
	
	@Test
	void testSumarConPunto() {
		Point nuevoPoint = point.sumarConPunto(new Point(3,2));
		assertEquals(5, nuevoPoint.getX());
		assertEquals(5, nuevoPoint.getY());
	}
}
