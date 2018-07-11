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
		assertEquals(5, sub.subtract(10-5);
		assertEquals(2, sub.subtract(8-6));
		assertEquals(-5, sub.subtract(0-5));
		assertEquals(-12, sub.subtract(-18-6));
	}

}
