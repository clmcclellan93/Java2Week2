package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;

public class CarSpeedLogicTests {
	
	Car car = new Car("testMake", "testModel", 2000);
	
	@Before
	public void setUp() throws Exception {
	}
	
	//testing function of accelerate helper method
	@Test
	public void accelerateTest() {
		car.accelerate(20);
		assertEquals(20, car.getSpeed(), 0);
	}
	
	//testing that accelerate helper method properly caps speed at 200
	@Test
	public void maxAccelerateTest() {
		car.accelerate(250);
		assertTrue(car.getSpeed() == 200);
	}
	
	//testing function of brake helper method
	@Test
	public void brakeTest() {
		car.accelerate(30);
		car.brake(20);
		assertEquals(10, car.getSpeed(), 0);
	}
	
	//testing that brake cannot lower speed below 0
	@Test
	public void minBrakeTest() {
		car.accelerate(20);
		car.brake(100);
		assertFalse(car.getSpeed() < 0);
	}

}
