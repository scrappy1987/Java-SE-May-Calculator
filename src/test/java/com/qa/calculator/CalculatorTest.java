package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Add calc = new Add();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void subtractTest() {
		Subtract calc = new Subtract();
		int actualValue = calc.subtract(5, 2);
		Assert.assertEquals(3, actualValue);
	}

}
