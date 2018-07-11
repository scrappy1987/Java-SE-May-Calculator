package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {

	@Test
	public void addTest() {
		Add calc = new Add();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}

}
