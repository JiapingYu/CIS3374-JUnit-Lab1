package com.lab1.calculator;

import static org.junit.Assert.*;


import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void addtest() {
		assertEquals(4, calculator.add(2, 2));
	}
	public void subtracttest(){
		assertEquals(0, calculator.subtract(2, 2));
	}
	public void Multiplytest() {
		assertEquals(6, calculator.multiply(2, 3));
	}
	public void dividetest() {
		
		assertEquals(1, calculator.divide(2, 2));
	}
	public void equaltest(){
		assertTrue(calculator.isEqual(2, 2));
		assertFalse(calculator.isEqual(2, 3));
	}

}
