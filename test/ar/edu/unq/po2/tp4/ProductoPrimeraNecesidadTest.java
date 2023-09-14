package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad manteca;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		manteca = new ProductoPrimeraNecesidad("Manteca", 100.0, false, 20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(Double.valueOf(7.2), leche.getPrecio());
		assertEquals(Double.valueOf(80.0), manteca.getPrecio());
	}
}
