package com.pernudo.TDD_Practice;

import com.pernudo.TDD_Practice.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TDDPracticeApplicationTests {

	@Test
	public void createCarSpeedIsZero() {
		Car newCar = new Car();
		Assertions.assertEquals(0, newCar.speed);
	}

	@Test
	public void accelerateCarSpeedIncreases() {
		Car newCar = new Car();
		newCar.accelerate(30);
		Assertions.assertEquals(30, newCar.speed);
	}
	@Test
	public void slowDownCarSpeedDecreases() {
		Car newCar = new Car();
		newCar.speed = 50;
		newCar.slowDown(20);
		Assertions.assertEquals(30, newCar.speed);
	}

	@Test
	public void slowDownCarSpeedNotBeLessThanZero() {
		Car newCar = new Car();
		newCar.speed = 50;
		newCar.slowDown(80);
		Assertions.assertEquals(0, newCar.speed);
	}

}
