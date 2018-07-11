package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator();
		int actualValue = calc.multiply(2, 2);
		Assert.assertEquals(4, actualValue);
	}

}
