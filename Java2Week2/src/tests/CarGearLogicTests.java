package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;

public class CarGearLogicTests {
	
	Car car = new Car("testMake", "testModel", 2000);
	
	@Before
	public void setUp() throws Exception {
	}

	//testing function of shiftUp helper method
	@Test
	public void shiftUpTest() {
		car.shiftUp();
		assertEquals(1, car.getGear(), 0);
	}
	
	//testing that shiftUp properly caps gear at 5
	@Test
	public void maxShiftUpTest() {
		for (int i = 0; i < 6; i++) {
			car.shiftUp();
		}
		assertEquals(5, car.getGear(), 0);
	}
	
	//testing function of shiftDown helper method
	@Test
	public void shiftDownTest() {
		car.shiftDown();
		assertEquals(-1, car.getGear(), 0);
	}
	
	//testing that shiftDown cannot set gear below -1
	@Test
	public void minShiftDownTest() {
		for (int i = 0; i < 2; i++) {
			car.shiftDown();
		}
		assertNotEquals(-2, car.getGear(), 0);
	}
	
}
