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

	public int getSize() {
		// int size = counter.size();
		return counter.size();
	}
}
