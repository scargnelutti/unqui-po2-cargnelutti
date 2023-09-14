package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> counter = new ArrayList<Integer>();
	
	public void addNumber(int x) {
		counter.add(x);
	}
	
	public int countEvenNumbers() {
		int result = 0;
		for (int numero: counter) {
			if ((numero % 2) == 0) {
				result = result + 1;
			}
		}
		return result;
	}
	
	public int countOddNumbers() {
		int result = 0;
		for (int numero: counter) {
			if ((numero % 2) == 1) {
				result = result + 1;
			}
		}
		return result;
	}

	public int getSize() {
		return counter.size();
	}

	public int countMultiplesOf(int x) {
		int result = 0;
		x = 2;
		for (int i = 0; i < counter.size(); i++) {
			if ((counter.get(i) % x) == 0) {
				result++;
			}
		}
		return result;
	}
	
	// 2
	public int numeroConMayorCantidadDeDigitosParesEn(Counter x) {
		int result = 0;
		int numeroActual = 0;
		for (int i = 0; i < x.getSize(); i++) {
			if (x.digitosParesEnNumero(x.getElementAt(i)) > numeroActual) {
				result = x.getElementAt(i);
			}
		}
		return result;
	}
	
	public int digitosParesEnNumero(int x) {
		int result = 0;
		while (x > 0) {
			if ((x % 10) % 2 == 0) {
				result++;
			}
			x = x / 10;
		}
		return result;
	}
	
	public int getElementAt(int x) {
		return counter.get(x);
	}

	// 3
	public int numeroMenorAMilYMultiploDeY(int x, int y) {
		int result = x * y;
		for (int i = 1000; i > 0; i--) {
			if ((i % result) == 0) {
				return i;
			}
		}
		return -1;
	}
}
