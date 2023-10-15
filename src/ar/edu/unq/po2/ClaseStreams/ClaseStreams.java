package ar.edu.unq.po2.ClaseStreams;

import java.util.ArrayList;
import java.util.List;

public class ClaseStreams {

	public ClaseStreams() {
	
	}	
	// IMPLEMENTE UN METODO QUE RECIBE COMO PARAMETRO UNA LISTA DE STRINGS Y UN PREFIJO Y 
	// DEVUELVE UNA NUEVA LISTA CON SOLO ELEMENTOS QUE EMPIECEN CON ESE PREFIJO
	public List<String> elementosQueEmpiecenConEn(String prefijo, List<String> strings) {
		List<String> resultado = new ArrayList<String>();
		for (String elemento: strings) {
			if (elemento.startsWith(prefijo)) {
				resultado.add(elemento);
			}
		}	
		return resultado;	
	}
	
	// IMPLEMENTE UN METODO QUE RECIBE COMO PARAMETRO UNA LISTA DE STRINGS Y UN PREFIJO Y 
	// DEVUELVE TRUE SI HAY AL MENOS UN ELEMENTO QUE EMPIECE CON EL PREFIJO
	public boolean hayUnElementoQueEmpieceConEn(String prefijo, List<String> strings) {
		for (String elemento: strings) {
			if (elemento.startsWith(prefijo)) {
				return true;
			}
		}
		return false;
	}
	// IMPLEMENTE UN METODO QUE RECIBE COMO PARAMETRO UNA LISTA DE STRINGS Y UN PREFIJO Y 
	// DEVUELVE TRUE SI HAY AL MENOS UN ELEMENTO QUE EMPIECE CON EL PREFIJO
	public boolean hayUnElementoQueEmpieceConEnn(String prefijo, List<String> strings) {
		// strings.stream().anyMatch(s->s.startsWith(prefijo));
		boolean encontro = false;
		int i = 0;
		while (!encontro && i < strings.size()) {
			encontro = strings.get(i).startsWith(prefijo);
			i++;
		}
		return encontro;
	}
	
	// IDEM AL ANTERIOR PERO DEVUELVE TRUE SI TODOS CUMPLEN ESA CONDICION
	public boolean todosLosElementoEmpiezanConEn(String prefijo, List<String> strings) {
		// strings.stream().allMatch(s->s.startsWith(prefijo));
		boolean cumple = true;
		int i = 0;
		while (cumple && i < strings.size()) {
			cumple = strings.get(i).startsWith(prefijo);
			i++;
		}
		return cumple;
	}
}
