package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDelMercadoCentralTest {

	private Producto unProducto;
	private ProductoDeCooperativa unProductoDeCooperativa;
	private CajaDelMercadoCentral unaCajaDelMercadoCentral;
	
	@BeforeEach
	void setUp() throws Exception {
		unaCajaDelMercadoCentral = new CajaDelMercadoCentral();
		unProducto = new Producto("Leche", 20.0, 200);
		unProductoDeCooperativa = new ProductoDeCooperativa("Manteca", 30.0, 300);
		unaCajaDelMercadoCentral.ponerProductoEnFila(unProducto);
		unaCajaDelMercadoCentral.ponerProductoEnFila(unProductoDeCooperativa);
	}

	@Test
	void testRegistrarProducto() {
		// Antes de registrar productos
		assertEquals(2, unaCajaDelMercadoCentral.getProductosEnFila().size());
		assertEquals(0.00, unaCajaDelMercadoCentral.getMontoAPagar());
		// Despues de registrar productos
		unaCajaDelMercadoCentral.registrarProducto(unProducto);
		unaCajaDelMercadoCentral.registrarProducto(unProductoDeCooperativa);
		assertEquals(0, unaCajaDelMercadoCentral.getProductosEnFila().size());
		assertEquals(47.00, unaCajaDelMercadoCentral.getMontoAPagar());
	}
	
	@Test
	void testDecrementarStock() {
		unaCajaDelMercadoCentral.registrarProducto(unProducto);
		assertEquals(199, unProducto.getStock());
	}
	
}
