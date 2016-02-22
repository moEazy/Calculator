package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	/**
	 * getTotal() method is being tested through the other methods 
	 */
	
	@Test
	public void testCalcConstructor() {
		Calculator calc = new Calculator();
		
		assertNotNull(calc);
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(2);
		
		assertEquals("7", String.valueOf(calc.getTotal()));
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.add(15);
		calc.subtract(10);
		
		assertEquals("5", String.valueOf(calc.getTotal()));
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(15);
		calc.subtract(10);
		calc.multiply(5);
		
		assertEquals("25", String.valueOf(calc.getTotal()));
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(15);
		calc.subtract(10);
		calc.multiply(5);
		calc.divide(5);
		
		assertEquals("5", String.valueOf(calc.getTotal()));
	}
	@Test
	public void testDivideByZero() {
		Calculator calc = new Calculator();
		calc.add(15);
		calc.subtract(10);
		calc.multiply(5);
		calc.divide(0);
		
		assertEquals("0", String.valueOf(calc.getTotal()));
	}
	@Test
	public void getHistory() {
		Calculator calc = new Calculator();
		calc.add(15);
		calc.subtract(10);
		calc.multiply(5);
		calc.divide(5);
		
		assertEquals("", calc.getHistory());
	}
	

}
