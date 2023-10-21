package ar.edu.unq.po2.TPTestYTestDoubles;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PokerStatus {
	
	// Devuelve un String con el nombre de la jugada que corresponda
	public String verificar(Carta carta, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> cartas = Arrays.asList(carta, carta2, carta3, carta4, carta5);
		
		if (this.verificarPoker(cartas.stream())) {
			return "Poker";
		}
		else if (this.verificarColor(cartas.stream())) {
			return "Color";
		}
		else if (this.verificarTrio(cartas.stream())) {
			return "Trio";
		}
		return "Nada";
	}

	// Retorna verdadero si hay al menos 4 cartas con el mismo valor
	private boolean verificarPoker(Stream<Carta> cartas) {
		int tamaño = (int) cartas.mapToInt(carta -> Integer.valueOf(carta.getValor())).distinct().count();
		return tamaño == 1 || tamaño == 2;
	}
	
	// Retorna verdadero si todas las cartas tienen el mismo palo
	private boolean verificarColor(Stream<Carta> cartas) {
		int tamaño = (int) cartas.map(carta -> carta.getPalo()).distinct().count();
		return tamaño == 1;
	}

	// Retorna verdadero si hay al menos 3 cartas con el mismo valor
	private boolean verificarTrio(Stream<Carta> cartas) {
		int tamaño = (int) cartas.mapToInt(carta -> Integer.valueOf(carta.getValor())).distinct().count();
		return tamaño == 2 || tamaño == 3;
	}
	
	// No funciona con los valores A, J, Q, K
	public boolean esDeMayorValorQue(Carta unaCarta, Carta otraCarta) {
		return Integer.parseInt(unaCarta.getValor()) > Integer.parseInt(otraCarta.getValor());
	}

	public boolean esDelMismoPaloQue(Carta unaCarta, Carta otraCarta) {
		return unaCarta.getPalo().equals(otraCarta.getPalo());
	}
}
