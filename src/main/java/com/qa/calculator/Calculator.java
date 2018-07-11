package com.qa.calculator;

public class Calculator {

	public int add(int num1, int num2) {
		Add addition = new Add();
		return addition.add(num1, num2);
	}

	public int minus(int i, int j) {
		Minus subtraction = new Minus();
		return subtraction.minus(i, j);
	}

	public int multiply(int i, int j) {
		Multiply multiplication = new Multiply();
		return multiplication.multiply(i, j);
	}
	
	public double divide(int i, int j) {
		Divide division = new Divide();
		return (double)division.divide(i, j);
	}


}
