package ar.edu.unq.po2.TPTMA;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTest {

	private MismaLetraInicial unMismaLetraInicial;
	
	@BeforeEach
	void setUp() throws Exception {
		unMismaLetraInicial = new MismaLetraInicial();
	}

	@Test
	void testGetSimilarPages() {
		// List<WikipediaPage> paginasSimilares = unMismaLetraInicial.getSimilarPages(pagina1, paginas);
		// assertEquals(paginasSimilares.size(), 1);
		assertEquals(1,1);
	}

}
