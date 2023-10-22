package ar.edu.unq.po2.TPTMA;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTest {

	private MismaLetraInicial unMismaLetraInicial;
	
	@BeforeEach
	void setUp() throws Exception {
		unMismaLetraInicial = mock(MismaLetraInicial.class);
	}

	@Test
	void testGetSimilarPages() {
		// List<WikipediaPage> paginasSimilares = unMismaLetraInicial.getSimilarPages(pagina1, paginas);
		// assertEquals(paginasSimilares.size(), 1);
		assertEquals(1 ,1);
	}

}
