package pkg;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuent {
	
	static Cuenta cta12345;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cta12345=new Cuenta("pepe", "23232", 50d);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void TestReintegro() throws Exception {
		assertEquals(45, cta12345.reintegro(5)); 
	}
	
	@Test
	void testIngreso() throws Exception {
		assertEquals(50, cta12345.ingreso(5)); 
	}
	
	

}
