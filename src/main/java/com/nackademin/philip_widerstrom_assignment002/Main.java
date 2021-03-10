package com.nackademin.philip_widerstrom_assignment002;

public class Main {

	public static void main(String[] args) {
		// Create instances of our two calculator classes
		BasicCalculator bc = new BasicCalculator();
		AdvancedCalculator ac = new AdvancedCalculator();
		
		// Create two double-variables to check our methods in each class
		// BasicCalculator
		double valueOne = 10;
		double valueTwo = 5;
		System.out.println("Basic Calculator:");
		System.out.println("Addition:  "  + bc.addition(valueOne, valueTwo));
		System.out.println("Subtracton "  + bc.subtraction(valueOne, valueTwo));
		System.out.println("Division "  + bc.division(valueOne, valueTwo));
		System.out.println("Division with negative value"  + bc.division(valueOne, 0));
		System.out.println("Multiplication "  + bc.multiplication(valueOne, valueTwo));
		System.out.println("-------------------------------------:");
		
		// AdvancedCalculator
		System.out.println("Advanced Calculator:");
		System.out.println("Addition:  "  + ac.addition(valueOne, valueTwo));
		System.out.println("Subtracton "  + ac.subtraction(valueOne, valueTwo));
		System.out.println("Division "  + ac.division(valueOne, valueTwo));
		System.out.println("Multiplication "  + ac.multiplication(valueOne, valueTwo));
		

		System.out.println("SquareRoot:  "  + ac.squareRoot(valueOne));
		System.out.println("AbsoluteValue:  "  + ac.absolutValue(valueOne));
		System.out.println("PowerOf:  "  + ac.powerOf(valueOne, valueTwo));
		System.out.println("SquareArea:  "  + ac.areaOfSquare(valueOne, valueTwo));
		System.out.println("CircleArea:  "  + ac.areaOfCircle(valueTwo));
		System.out.println("--------------------.-----------------:");

		System.out.println("SquareRoot:  "  + ac.squareRoot(valueOne));
		System.out.println("AbsoluteValue:  "  + ac.absolutValue(valueOne));
		System.out.println("PowerOf:  "  + ac.powerOf(valueOne, valueTwo));
		System.out.println("SquareArea:  "  + ac.areaOfSquare(valueOne, valueTwo));
		System.out.println("CircleArea:  "  + ac.areaOfCircle(valueTwo));
		System.out.println("-------------------------------------:");
		System.out.println("-------------------------------------:");

		
		
					
	}

	
	
}
