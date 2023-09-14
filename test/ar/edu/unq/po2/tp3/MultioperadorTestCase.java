package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador multioperador;
	ArrayList<Integer> numerosDePrueba;
	
	@BeforeEach
	public void setUp() throws Exception {
		multioperador = new Multioperador();
		numerosDePrueba = new ArrayList<Integer>();
		numerosDePrueba.add(1);
		numerosDePrueba.add(2);
		numerosDePrueba.add(3);
		numerosDePrueba.add(4);
		numerosDePrueba.add(5);
		numerosDePrueba.add(6);
		numerosDePrueba.add(7);
		numerosDePrueba.add(8);
		numerosDePrueba.add(9);
		numerosDePrueba.add(10);
	}
	
	@Test
	void testSumarNumerosEnArrayList() {
		int resultado = multioperador.sumarNumerosEn(numerosDePrueba);
		assertEquals(55, resultado);
	}
	
	@Test
	void testRestarNumerosEnArrayList() {
		int resultado = multioperador.restarNumerosEn(numerosDePrueba);
		assertEquals(-55, resultado);;
	}
	
	@Test
	void testMultiplicarNumerosEnArrayList() {
		int resultado = multioperador.multiplicarNumerosEn(numerosDePrueba);
		assertEquals(3628800, resultado);;
	}
}
