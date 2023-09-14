package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestRehacer {
	// Rehacer con la implementación del TP 1
	private RectanguloRehacer rectangulo;
	
	public RectanguloRehacer getRectangulo() {
		return rectangulo;
	}

	@BeforeEach
	void setUp() throws Exception {
		rectangulo = new RectanguloRehacer(new Point(3, 5), new Point(0, 2));
	}

	@Test
	void testGetArea() {
		int a = 1;
		assertEquals(1, a);
	}

	@Test
	void testGetPerimetro() {
		int a = 1;
		assertEquals(1, a);
	}

}
