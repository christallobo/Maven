package com.lti;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImplTest {

	@Test
	public void testAddForSuccess() {
		CalculatorImpl target = new CalculatorImpl();
		int result = target.add(100, 240);
		assertEquals(340, result);

	}

	@Test(expected=IllegalArgumentException.class) // will pass only when the calling method returns the specified exception
	public void testAddForException() {
		CalculatorImpl target = new CalculatorImpl();
		target.add(-100, 20);
		
	}

}
