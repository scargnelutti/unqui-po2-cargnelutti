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
		counter.addNumber(9);
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
		int amount = counter.countOddNumbers();
		assertEquals(4, amount);
	}
	
	@Test
	void testCountMultiplesOf() {
		int amount = counter.countMultiplesOf(2);
		assertEquals(5, amount);
	}
	
	// 2
	@Test
	void testNumeroConMayorCantidadDeDigitosPares() {
		int result = counter.numeroConMayorCantidadDeDigitosParesEn(counter);
		assertEquals(444, result);
	}
	
	// 3
	@Test
	void testNumeroMenorAMilYMultiploDeDosNumeros() {
		int result = counter.numeroMenorAMilYMultiploDeY(3, 9);
		assertEquals(999, result);
		result = counter.numeroMenorAMilYMultiploDeY(400, 3);
		assertEquals(-1, result);
	}
	
	// 4
	/*
	String a = "abc";
	String s = a;
	String t;
	
	Indique que valores retornan las siguientes expresiones o, si dan error, por qué se producen:
	● s.length(); 3
	● t.length(); Error, porque t no está inicializado
	● 1 + a; "1abc"
	● a.toUpperCase(); "ABC"
	● "Libertad".indexOf("r"); 4
	● "Universidad".lastIndexOf('i'); 8
	● "Quilmes".substring(2,4); "il"
	● (a.length() + a).startsWith("a"); false
	● s == a; false
	● a.substring(1,3).equals("bc") true
	*/
	
	// 5
	/*
	1. ¿Qué son los tipos de datos primitivos?
	Son tipos de datos predefinidos en el lenguaje.
	
	2. ¿Cuál es la diferencia entre un int y un Integer?
	El primero es un tipo de dato primitivo, el segundo es una clase.
	
	3. ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y 
	si se define una de tipo Integer? Haga la prueba en Eclipse.
	Si es de tipo int, su valor predeterminado es 0.
	Si es de tipo Integer, su valor predeterminado es null.
	
	4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de
	instancia se define una variable de método.
	Según la documentación, su valor es 0. Sin embargo, en el Eclipse, el debugger no muestra 
	ningun valor para la variable.
	*/
}
