package ar.edu.unq.po2.TPTestYTestDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.stream.Stream;

class PokerStatusTest {

	/*
	 * 	// SUT: PokerStatus
		// DOC: Carta
	 */
	private PokerStatus unPokerStatus;
	/*
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;*/
	
	// Setup
	@BeforeEach
	void setUp() throws Exception {
		unPokerStatus = new PokerStatus();
		/*
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);*/
		
	}

	
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
	
		/*
		when(unPokerStatus.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn("Poker");
		String resultado = unPokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		assertEquals("Poker", resultado);*/
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
	
	/* 1) ¿Qué son los test doubles? 
	Tests unitarios en el que cualquier conocimiento por fuera del SUT es un objeto falso
	
	*/
}
