package ar.edu.unq.po2.TPTestYTestDoubles;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PokerStatus {

	/* Anterior verificar()
	// Devuelve verdadero cuando hay 4 cartas con el mismo número
	public boolean verificar(String string, String string2, String string3, String string4, String string5) {
		Stream<String> cartas = Stream.of(string, string2, string3, string4, string5);
		cartas = cartas.map(carta -> carta.substring(0, carta.length() - 1)).distinct();
		return cartas.toList().size() <= 3;
	}
	*/
	
	// Devuelve verdadero cuando hay 4 cartas con el mismo número
	public String verificar(String string, String string2, String string3, String string4, String string5) {
		List<String> cartas = Arrays.asList(string, string2, string3, string4, string5);
		
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

	private boolean verificarPoker(Stream<String> cartas) {
		cartas = cartas.map(carta -> carta.substring(0, carta.length() - 1)).distinct();
		int tamaño = cartas.toList().size();
		return tamaño == 1 || tamaño == 2;
	}
	
	private boolean verificarColor(Stream<String> cartas) {
		cartas = cartas.map(carta -> carta.substring(carta.length() - 1));
		return cartas.distinct().toList().size() == 1;
	}

	private boolean verificarTrio(Stream<String> cartas) {
		cartas = cartas.map(carta -> carta.substring(0, carta.length() - 1)).distinct();
		int tamaño = cartas.toList().size();
		return tamaño == 2 || tamaño == 3;
	}
}
