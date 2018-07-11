package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test 
	public void multiplyTest() {
		Calculator calc2 = new Calculator();
		int actualValue = calc2.multiply(3, 3);
		Assert.assertEquals(9, actualValue);
		
	}
	@Test
	public void subtractTest() {
		Calculator calc3 = new Calculator();
		int actualValue = calc3.subtract(20, 7);
		Assert.assertEquals(13, actualValue);
	}
	@Test
	public void divideTest() {
		Calculator calc4 = new Calculator();
		double actualValue = calc4.divide(24, 8);
		Assert.assertEquals(3.0, actualValue, 0.001);
	}

}
