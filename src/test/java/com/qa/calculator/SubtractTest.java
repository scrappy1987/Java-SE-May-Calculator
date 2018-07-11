package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubtractTest {


	@Test
	public void test() {
		Subtract sub = new Subtract();
		assertEquals(5, sub.subtract(10.0,5.0), 0.001);
		assertEquals(2, sub.subtract(8.0,6.0), 0.001);
		assertEquals(-5, sub.subtract(0,5.0), 0.001);
		assertEquals(-24, sub.subtract(-18.0,6.0), 0.001);
		assertEquals(4.8, sub.subtract(6.2, 1.4),0.001);
	}

}
