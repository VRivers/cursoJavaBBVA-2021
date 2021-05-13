package util.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import util.ConnectionManager;

public class ConnectionManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConectar() {
	
			try {
				ConnectionManager.conectar();
				assertTrue(true);
			} catch (ClassNotFoundException | SQLException e) {
				assertTrue(false);
				e.printStackTrace();
			}

		
	}

}
