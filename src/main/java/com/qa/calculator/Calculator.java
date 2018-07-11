package com.qa.calculator;

public class Calculator {

	public int add(int num1, int num2) {
		
		Adder adder = new Adder();
		
		return adder.add(num1, num2);
		
	}
	public int multiply(int num1, int num2) {
		
		Multiplier multiplier = new Multiplier();
		
		return multiplier.multiply(num1, num2);
		
	}
	public int subtract(int num1, int num2) {
		
		Subtracter subtracter = new Subtracter();
		
		return subtracter.subtract(num1, num2);
	}
	public double divide(int num1, int num2) {
		
		Divider divider = new Divider();
		
		return divider.divide(num1, num2);
	}

}
