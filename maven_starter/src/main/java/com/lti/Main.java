package com.lti;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new CalculatorImpl();
		int result = calc.add(1000, 10111);
		System.out.println("Result: " + result);
	}

}
