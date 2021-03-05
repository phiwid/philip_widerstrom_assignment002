package com.nackademin.philip_widerstrom_assignment002;

public class BasicCalculator implements BasicOperations{

	public double addition(double firstNum, double secondNum) {
		return firstNum + secondNum;
	}
	public double subtraction(double firstNum, double secondNum) {
		return firstNum - secondNum;
	}
	
	public double multiplication(double firstNum, double secondNum) {
		return firstNum * secondNum;
	}

	public double division(double firstNum, double secondNum) {
		if(secondNum == 0) {
			System.out.println("Its not possible to divide by zero!");
			return -999999; // Using an extreme value to make it obvious for the user that something went wrong
		} else {			
		}
		return firstNum / secondNum;
	}
}
