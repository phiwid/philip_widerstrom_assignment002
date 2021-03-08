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
	public void additionTestWithValidNumbers() {
		for(int x = 0; x < 5; x++) {
			double d1 = (rand.nextDouble() + (rand.nextInt(10)));
			double d2 = (rand.nextDouble() + (rand.nextInt(10)));
			double result = d1 + d2;
			log.info("Testing addition with  " + d1 + " + " + d2);
			assertEquals(bc.addition(d1, d2), result, 0);			
		}
	}
}
