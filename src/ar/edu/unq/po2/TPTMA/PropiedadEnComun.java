package ar.edu.unq.po2.TPTMA;

import java.util.List;
import java.util.Set;

public class PropiedadEnComun extends Filtro {

	@Override
	//  Retorna aquellas páginas que poseen alguna propiedad del infobox en comun
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		Set<String> claves = page.getInfobox().keySet();
		return wikipedia;
		/*
		return wikipedia.stream()
				.map(articulo -> articulo.getInfobox().keySet());
				*/
	}

}
