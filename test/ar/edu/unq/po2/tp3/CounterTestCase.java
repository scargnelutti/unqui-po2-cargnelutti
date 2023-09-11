package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		counter.addNumber(1);
		counter.addNumber(2);
		counter.addNumber(3);
		counter.addNumber(4);
		counter.addNumber(10);
		counter.addNumber(22);
		counter.addNumber(33);
		counter.addNumber(444);
	}

	@Test
	void testCountEvenNumbers() {
		int amount = counter.countEvenNumbers();
		assertEquals(5, amount);
	}
	
	@Test
	void testCountOddNumbers() {
		int amount = counter.countEvenNumbers();
		assertEquals(3, amount);
	}
	
	@Test
	void testCountMultiplesOf() {
		int amount = counter.countMultiplesOf(2);
		assertEquals(5, amount);
	}
	
	@Test
	void testNumeroConMayorCantidadDeDigitosPares() {
		int result = counter.numeroConMayorCantidadDeDigitosParesEn(counter);
		assertEquals(444, result);
	}
}
