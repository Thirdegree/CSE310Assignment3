package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}

	@Test
	public void testGetTotal() {
		Calculator test = new Calculator();
		assertEquals(0, test.getTotal());
		test.add(5);
		assertEquals(5, test.getTotal());
		test.multiply(5);
		assertEquals(25, test.getTotal());
		test.divide(25);
		assertEquals(1, test.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator test = new Calculator();
		test.add(5);
		assertEquals(5, test.getTotal());
		test.add(5);
		assertEquals(10, test.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator test = new Calculator();
		test.subtract(5);
		assertEquals(-5, test.getTotal());
		test.subtract(5);
		assertEquals(-10, test.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator test = new Calculator();
		test.add(1); //0*n = 0
		test.multiply(5);
		assertEquals(5, test.getTotal());
		test.multiply(5);
		assertEquals(25, test.getTotal());
		test.multiply(0);
		assertEquals(0, test.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator test = new Calculator();
		test.add(10);
		test.divide(5);
		assertEquals(2, test.getTotal());
		test.divide(2);
		assertEquals(1, test.getTotal());
		test.divide(0);
		assertEquals(0, test.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
