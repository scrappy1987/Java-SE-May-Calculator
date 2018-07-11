package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		Multiply mult = new Multiply();
		assertEquals(12.0, mult.multiply(6, 2));
		assertEquals(4.8, mult.multiply(2.4, 2));
		assertEquals(-4.2, mult.multiply(-2, 2.1));
	}

}
