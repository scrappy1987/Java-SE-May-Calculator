package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc;
	
	@Before
	public void setUp() {
		
		calc = new Calculator();
		
	}

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void testSubtraction() {
		
		int substractAnswer = calc.substract(4, 2);
		Assert.assertEquals(2, substractAnswer);
		
	}


}
