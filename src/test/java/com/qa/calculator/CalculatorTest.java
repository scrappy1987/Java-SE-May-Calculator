package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator calc = new Calculator();
	
	@Test
	public void add() {
		
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void minus() {
		int actualValue = calc.minus(6, 3);
		Assert.assertEquals(3, actualValue);
	}
	

}
