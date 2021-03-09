package com.nackademin.philip_widerstrom_assignment002;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	Random rand = new Random();
	public static final Logger log = Logger.getLogger(BasicCalculator.class.getName());
	
	@Test
	public void additionTestWithPositiveNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() + (rand.nextInt(10)));
			double d2 = (rand.nextDouble() + (rand.nextInt(10)));
			double result = d1 + d2;
			log.info("Testing addition with  " + d1 + " + " + d2);
			assertEquals(bc.addition(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void additionTestWithNegativeNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() + (-rand.nextInt(10)));
			double d2 = (-rand.nextDouble() + (-rand.nextInt(10)));
			double result = d1 + d2;
			log.info("Testing addition with  " + d1 + " + " + d2);
			assertEquals(bc.addition(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void additionTestWithZeroValues() {
			double d1 = 0;
			double d2 = 0;
			double result = d1 + d2;
			log.info("Testing addition with  " + d1 + " + " + d2);
			assertEquals(bc.addition(d1, d2), result, 0);			
	}
	
	@Test
	public void subtractionTestWithPositiveNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() - (rand.nextInt(10)));
			double d2 = (rand.nextDouble() - (rand.nextInt(10)));
			double result = d1 - d2;
			log.info("Testing subtraction with  " + d1 + " - " + d2);
			assertEquals(bc.subtraction(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void subtractionTestWithNegativeNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() - (-rand.nextInt(10)));
			double d2 = (-rand.nextDouble() - (-rand.nextInt(10)));
			double result = d1 - d2;
			log.info("Testing subtraction with  " + d1 + " - " + d2);
			assertEquals(bc.subtraction(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void subtractionTestWithZeroNumbers() {
			double d1 = 0;
			double d2 = 0;
			double result = d1 - d2;
			log.info("Testing subtraction with  " + d1 + " - " + d2);
			assertEquals(bc.subtraction(d1, d2), result, 0);			
	}
	
	@Test
	public void multiplicationTestWithPositiveNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() * (rand.nextInt(10)));
			double d2 = (rand.nextDouble() * (rand.nextInt(10)));
			double result = d1 * d2;
			log.info("Testing multiplication with  " + d1 + " * " + d2);
			assertEquals(bc.multiplication(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void multiplicationTestWithNegativeNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() * (-rand.nextInt(10)));
			double d2 = (-rand.nextDouble() * (-rand.nextInt(10)));
			double result = d1 * d2;
			log.info("Testing multiplication with  " + d1 + " * " + d2);
			assertEquals(bc.multiplication(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void multiplicationTestWithZero() {
		for(int x = 0; x < 5; x++) {
			double d1 = 0;
			double d2 = (-rand.nextDouble() * (-rand.nextInt(10)));
			double result = d1 * d2;
			log.info("Testing multiplication with  " + d1 + " * " + d2);
			assertEquals(bc.multiplication(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void divisionTestWithPositiveNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() / (rand.nextInt(10)));
			double d2 = (rand.nextDouble() / (rand.nextInt(10)));
			double result = d1 / d2;
			log.info("Testing division with  " + d1 + " / " + d2);
			assertEquals(bc.division(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void divisionTestWithNegativeNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (-rand.nextDouble() / (-rand.nextInt(10)));
			double d2 = (-rand.nextDouble() / (-rand.nextInt(10)));
			double result = d1 / d2;
			log.info("Testing division with  " + d1 + " / " + d2);
			assertEquals(bc.division(d1, d2), result, 0);			
		}
	}
	
	@Test
	public void divisionTestWithZero() {
			double d1 = 10.0;
			double d2 = 0.0;
			double result = -999999; // fall back value used in the method 
			log.info("Testing division with  " + d1 + " / " + d2);
			assertEquals(bc.division(d1, d2), result, 0);			
		}
	}



