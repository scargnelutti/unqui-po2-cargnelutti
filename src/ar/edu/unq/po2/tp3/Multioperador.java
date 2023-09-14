package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
	
	public int sumarNumerosEn(ArrayList<Integer> lista) {
		int result = 0;
		for (int numero: lista) {
			result = result + numero;
		}
		return result;
	}
	
	public int restarNumerosEn(ArrayList<Integer> lista) {
		int result = 0;
		for (int numero: lista) {
			result = result - numero;
		}
		return result;
	}
	
	public int multiplicarNumerosEn(ArrayList<Integer> lista) {
		int result = 1;
		for (int numero: lista) {
			result = result * numero;
		}
		return result;
	}
}
