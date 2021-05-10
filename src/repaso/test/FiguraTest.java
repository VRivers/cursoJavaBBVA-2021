package repaso.test;
import java.util.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;

public class FiguraTest {
	Figura cuadrado ;
	Figura circulo ;
	
	ArrayList<Figura> figuras;

	@Before
	public void setUp() throws Exception {
		cuadrado = new Cuadrado("cua1", 10);
		circulo  = new Circulo("cir1", 10);
		
		figuras = new ArrayList<Figura>();
		figuras.add(new Cuadrado("cua1", 10));
		figuras.add(new Circulo("cir1", 10));
		figuras.add(new Cuadrado("cua2", 15));
		figuras.add(new Circulo("cir2", 15));
		figuras.add(new Cuadrado("cua3", 12.5f));
		figuras.add(new Circulo("cua3", 12.5f));
		
	}

	@After
	public void tearDown() throws Exception {
		cuadrado = null;
		circulo = null;
	}

	@Test
	public void testCalcularPerimetro_cuadrado() {
		//valor esperado, metodo a testear, precision
		assertEquals(40, cuadrado.calcularPerimetro(), 0.1);
	}

	@Test
	public void testCalcularSuperficie_cuadrado() {
		assertEquals(100, cuadrado.calcularSuperficie(), 0.1);
	}

	@Test
	public void testGetValores() {
		assertEquals("l=10.0", cuadrado.getValores());
	}
	
	@Test
	public void testGetNombre() {
		assertEquals("cua1", cuadrado.getNombre());
	}
	
	@Test
	public void testEqualsyHasCode() {
		Cuadrado cuaPrueba = new Cuadrado("cua1", 10);
		assertTrue(figuras.contains(cuaPrueba));
	}

}
