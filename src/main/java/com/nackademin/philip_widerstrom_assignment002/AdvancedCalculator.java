package com.nackademin.philip_widerstrom_assignment002;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations{

	public double SquareRoot(double number) {
		double sqrt = Math.sqrt(number);
		return sqrt;
	}
	
	public double AbsolutValue(double number) {
		double abs = Math.abs(number);
		return abs;
	}

	public double PowerOf(double firstNum, double secondNum) {
		double pow = Math.pow(firstNum, secondNum);
		return pow;
	}

	public double AreaOfSqare(double firstNum, double secondNum) {
		return firstNum * secondNum;
	}

	public double AreaOfCircle(double radius) {
		return radius * radius * Math.PI;
	}

}
