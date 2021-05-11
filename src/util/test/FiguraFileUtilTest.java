package util.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import util.FiguraFileUtil;

	public class FiguraFileUtilTest {
		Figura cuadrado ;
		Figura circulo ;
		Figura triangulo ;
		
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
	public void testGenerarArchivo() {
		//valor esperado, metodo a testear, precision
		FiguraFileUtil.generarArchivo(figuras, "testGenerarArchivo", "C:/Users/Victor Rivera/javaworkspace/cursoJava/archivos");
	}

}
