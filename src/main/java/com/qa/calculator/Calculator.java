package com.qa.calculator;

public class Calculator {

	private AddNumbers ad = new AddNumbers();
	private SubNumbers sN = new SubNumbers();
	
	
	public int add(int num1, int num2) {
		int result = 0;
		result = this.ad.add(num1, num2);
		return result;
	}
	
	public int sub(int num1, int num2) {
		int result = 0;
		result = this.sN.sub(num1, num2);
		return result;
	}
	
	
}
