package ar.edu.unq.po2.TPTestYTestDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private PokerStatus unPokerStatus;
	
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
}
