import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuent {
	
	static Cuenta cta12345
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	 cta12345=new Cuenta(String nom, int tit, Double sal);
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
	void testIngreso() {
		assertEquals(1, cta12345.Ingreso(5)); 
	}
	
	@Test
	void TestReintegro() {
		assertEquals(1, cta12345.Reintegro(5)); 
	}

}
