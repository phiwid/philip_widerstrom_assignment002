package com.nackademin.philip_widerstrom_assignment002;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations{

	public double squareRoot(double number) {
		double sqrt = Math.sqrt(number);
		return sqrt;
	}
	
	public double absolutValue(double number) {
		double abs = Math.abs(number);
		return abs;
	}

	public double powerOf(double firstNum, double secondNum) {
		double pow = Math.pow(firstNum, secondNum);
		return pow;
	}

	public double areaOfSquare(double firstNum, double secondNum) {
		return firstNum * secondNum;
	}

	public double areaOfCircle(double radius) {
		return radius * radius * Math.PI;
	}

}
