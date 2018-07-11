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
	public void testSub() {
		Calculator calc = new Calculator();
	
		int actualValue = calc.sub(4,2);
		Assert.assertEquals(2,actualValue);
	}
	
}
