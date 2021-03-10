package com.nackademin.philip_widerstrom_assignment002;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	Random rand = new Random();
	AdvancedCalculator ac = new AdvancedCalculator();
	public static final Logger log = Logger.getLogger(BasicCalculator.class.getName());

	@Test
	public void squareRootPositiveNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() + (rand.nextInt(10)));		
			double result = Math.sqrt(d1);
			log.info("Testing square root with  " + d1);
			assertEquals(ac.squareRoot(d1), result, 0);			
		}
	}
	
	@Test
	public void squareRootNegativeNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() + (-rand.nextInt(10)));		
			double result = Math.sqrt(d1);
			log.info("Testing square root with  " + d1);
			assertEquals(ac.squareRoot(d1), result, 0);			
		}
	}
	
	@Test
	public void squareRootZeroTest() {
			double d1 = 0;		
			double result = Math.sqrt(d1);
			log.info("Testing square root with  " + d1);
			assertEquals(ac.squareRoot(d1), result, 0);			
	}
	
	@Test
	public void absoluteValueWithPositiveNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() + (rand.nextInt(10)));		
			double result = Math.abs(d1);
			log.info("Testing absValue with  " + d1);
			assertEquals(ac.absolutValue(d1), result, 0);			
		}
	}
	
	@Test
	public void absoluteValueTestWithNegativeNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() + (-rand.nextInt(10)));		
			double result = Math.abs(d1);
			log.info("Testing absValue with  " + d1);
			assertEquals(ac.absolutValue(d1), result, 0);			
		}
	}
	
	@Test
	public void absoluteValueTestWithZeroValueTest() {
			double d1 = 0;		
			double result = Math.abs(d1);
			log.info("Testing absValue with  " + d1);
			assertEquals(ac.absolutValue(d1), result, 0);			
	}
	
	@Test
	public void powerOfWithPositiveNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() + (rand.nextInt(5)));		
			double d2 = (rand.nextDouble() + (rand.nextInt(3)));		
			double result = Math.pow(d1,d2);
			log.info("Testing power of with  " + d1 + " " + d2);
			assertEquals(ac.powerOf(d1,d2), result, 0);			
		}
	}
	
	@Test
	public void powerOfWithNegativeNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() + (-rand.nextInt(5)));		
			double d2 = (-rand.nextDouble() + (-rand.nextInt(3)));		
			double result = Math.pow(d1,d2);
			log.info("Testing power of with  " + d1 + " " + d2);
			assertEquals(ac.powerOf(d1,d2), result, 0);			
		}
	}
	
	@Test
	public void powerOfWithZeroTest() {
			double d1 = 0;		
			double d2 = 0;		
			double result = Math.pow(d1,d2);
			log.info("Testing power of with  " + d1 + " " + d2);
			assertEquals(ac.powerOf(d1,d2), result, 0);			
	}
	
	@Test
	public void areaOfSquarePositveNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() + (rand.nextInt(10)));		
			double d2 = (rand.nextDouble() + (rand.nextInt(10)));	
			double result = d1 * d2;
			log.info("Testing area of square with  " + d1 + " " + d2);
			assertEquals(ac.areaOfSquare(d1,d2), result, 0);			
		}
	}
	@Test
	public void areaOfSquareNegativeNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() + (-rand.nextInt(10)));		
			double d2 = (-rand.nextDouble() + (-rand.nextInt(10)));	
			double result = d1 * d2;
			log.info("Testing area of square with  " + d1 + " " + d2);
			assertEquals(ac.areaOfSquare(d1,d2), result, 0);			
		}
	}
	@Test
	public void areaOfSquarZeroNumberTest() {
			double d1 = 0;		
			double d2 = 0;	
			double result = d1 * d2;
			log.info("Testing area of square with  " + d1 + " " + d2);
			assertEquals(ac.areaOfSquare(d1,d2), result, 0);			
	}
	
	@Test
	public void areaOfCirclePositiveNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() + (rand.nextInt(10)));					
			double result = Math.PI * (Math.pow(d1, 2));
			log.info("Testing area of circle with  " + d1);
			assertEquals(ac.areaOfCircle(d1), result, 0);			
		}
	}
	
	@Test
	public void areaOfCircleNegativeNumberTest() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() + (-rand.nextInt(10)));					
			double result = Math.PI * (Math.pow(d1, 2));
			log.info("Testing area of circle with  " + d1);
			assertEquals(ac.areaOfCircle(d1), result, 0);			
		}
	}
	
	@Test
	public void areaOfCircleZeroTest() {	
			double d1 = (-rand.nextDouble() + (-rand.nextInt(10)));					
			double result = Math.PI * (Math.pow(d1, 2));
			log.info("Testing area of circle with  " + d1);
			assertEquals(ac.areaOfCircle(d1), result, 0);					
	}

}
