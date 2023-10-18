package ar.edu.unq.po2.TPTMA;

import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	// Devuelve las paginas que contengan al menos un link en comun con page
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> paginas = page.getLinks();
		return wikipedia.stream().
				filter(pagina -> paginas.contains(pagina)).toList();
	}

}
