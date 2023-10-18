package ar.edu.unq.po2.TPTMA;

import java.util.List;

public class MismaLetraInicial extends Filtro {

	@Override
	// Devuelve las paginas cuyo titulo comience con la misma letra que page
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return wikipedia.stream().filter(articulo -> articulo.getTitle().startsWith(page.getTitle().substring(0, 1))).toList();
	}

}
