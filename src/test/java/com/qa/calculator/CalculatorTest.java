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
	@Test
	public void testMulti() {
		Calculator calc = new Calculator();
		
		int actualValue = calc.multiply(4,2);
		Assert.assertEquals(8,actualValue);
	}
	
	@Test
	public void testDiv() {
		Calculator calc = new Calculator();
	
		int actualValue = calc.div(4,2);
		Assert.assertEquals(2,actualValue);
	}
}
