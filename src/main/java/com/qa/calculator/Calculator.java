package com.qa.calculator;

public class Calculator {

	private AddNumbers ad = new AddNumbers();
	
	
	public int add(int num1, int num2) {
		int result = 0;
		result = ad.add(num1, num2);
		return result;
	}
}
