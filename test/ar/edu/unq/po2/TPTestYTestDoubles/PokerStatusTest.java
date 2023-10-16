package ar.edu.unq.po2.TPTestYTestDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private PokerStatus unPokerStatus;

	/*
	Carta carta = new Carta("10", "D");
	Carta carta2 = new Carta("4", "T");
	Carta carta3 = new Carta("1", "D");
	Carta carta4 = new Carta("K", "D");
	Carta carta5 = new Carta("4", "D");
	Carta carta6 = new Carta("5", "D");
	Carta carta7 = new Carta("10", "P");
	Carta carta8 = new Carta("10", "D");
	Carta carta9 = new Carta("1", "P");
	
	
	 * String poker = unPokerStatus.verificar(carta, carta7, carta8, carta11, carta2);
		String color = unPokerStatus.verificar(carta, carta3, carta4, carta5, carta6);
		String trio = unPokerStatus.verificar(carta, carta7, carta8, carta5, carta6);
		String nada = unPokerStatus.verificar(carta, carta9, carta10, carta11, carta6);
	 */
	// Setup
	@BeforeEach
	void setUp() throws Exception {
		unPokerStatus = new PokerStatus();
	}

	/* Para anterior verificar()
	@Test
	void testVerificar() {
		// Exercise
		boolean hayPoker = unPokerStatus.verificar("10D", "10D", "10D", "10D", "4T");
		boolean hayPoker2 = unPokerStatus.verificar("10D", "1P", "KC", "4T", "5D");
		// Verify
		assertEquals(true, hayPoker);
		assertEquals(false, hayPoker2);
	}
	*/
	
	/* Previo a la clase Carta
	@Test
	void testVerificar() {
		// Exercise
		String poker = unPokerStatus.verificar("10D", "10D", "10D", "10D", "4T");
		String color = unPokerStatus.verificar("10D", "1D", "KD", "4D", "5D");
		String trio = unPokerStatus.verificar("10D", "10P", "10C", "4D", "5D");
		String nada = unPokerStatus.verificar("10D", "1P", "KC", "10T", "5D");
		// Verify
		assertEquals("Poker", poker);
		assertEquals("Color", color);
		assertEquals("Trio", trio);
		assertEquals("Nada", nada);
	}
	*/
	
	@Test
	void testVerificar() {
		// Exercise
		String poker = unPokerStatus.verificar(new Carta("10", "D"), new Carta("10", "C"), new Carta("10", "P"), new Carta("10", "T"), new Carta("4", "T"));
		String color = unPokerStatus.verificar(new Carta("10", "D"), new Carta("1", "D"), new Carta("9", "D"), new Carta("4", "D"), new Carta("5", "D"));
		String trio = unPokerStatus.verificar(new Carta("10", "D"), new Carta("10", "P"), new Carta("10", "C"), new Carta("4", "D"), new Carta("5", "D"));
		String nada = unPokerStatus.verificar(new Carta("10", "D"), new Carta("1", "P"), new Carta("9", "D"), new Carta("10", "T"), new Carta("5", "D"));
		// Verify
		assertEquals("Poker", poker);
		assertEquals("Color", color);
		assertEquals("Trio", trio);
		assertEquals("Nada", nada);
	}
	
	@Test
	void testEsDeMayorValorQue() {
		assertEquals(true, unPokerStatus.esDeMayorValorQue(new Carta("3", "P"), new Carta("2", "C")));
		assertEquals(false, unPokerStatus.esDeMayorValorQue(new Carta("3", "D"), new Carta("5", "D")));
	}
	
	@Test
	void testEsDelMismoPaloQue() {
		assertEquals(true, unPokerStatus.esDelMismoPaloQue(new Carta("3", "D"), new Carta("5", "D")));
		assertEquals(false, unPokerStatus.esDelMismoPaloQue(new Carta("3", "D"), new Carta("5", "P")));
	}
}
