package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Addition addition;
	private Substraction substract;
	private Multiplication  multiply;
	private Division division;
	
	@Before
	public void setUp() {
		
		addition = new Addition();
		substract = new Substraction();
		multiply = new Multiplication();
		division = new Division();
		
	}

	@Test
	public void tesAddition() {
		int actualValue = addition.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void testMultiplication() {
		
		int multiplicationAnswer = multiply.multiplication(4, 2);
		Assert.assertEquals(8, multiplicationAnswer);
		
	}
	
	@Test
	public void testSubstract() {
		
		int substractAnswer = substract.substract(6, 2);
		Assert.assertEquals(4,  substractAnswer);
		
	}
	
	@Test
	public void testDivision() {
		
		int divisionAnswer = division.division(8, 4);
		Assert.assertEquals(2, divisionAnswer);
		
	}


}
