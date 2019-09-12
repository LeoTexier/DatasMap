package datasmap.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datasmap.models.Place;

class TestPlace {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPlaceStringDoubleDouble() {
		Place p=new Place("1",0.001, -0.005);
		assertNull(p.getParent());
		assertEquals("1", p.getAdress());
	}

	@Test
	void testPlaceStringDoubleDoublePlace() {
		Place p0= new Place("Caen", 0.001,-0.005);
		Place p1= new Place("Rue du fond", 0.001,-0.005,p0);
		Place p2= new Place ("1",0.001,-0.005,p1);
		
		assertEquals(p0.getAdress(),"Caen",p0.getAdress());
		assertEquals(p1.getAdress(), "Rue du fond,Caen",p1.getAdress());
		assertEquals(p2.getAdress(), "1,Rue du fond,Caen",p2.getAdress());
	}

}
