package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	@Test
	public void subtractTest() {
		Subtract calc = new Subtract();
		int actualValue = calc.subtract(5, 3);
		Assert.assertEquals(2, actualValue);
	}

}
