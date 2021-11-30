package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import buisnesscode.Calculator;

public class CalculatorTest {

	private Calculator calc;
	/* 
	 * /*@Before annotation in JUnit is used on a method containing Java code to run before each test case. 
	 * i.e it runs before each test execution.*/
	 
	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}
	
	/* 
	 * @After annotation is used on a method containing java code to run after each test case. 
	 * These methods will run even if any exceptions are thrown in the test case or in the case of assertion failures
	 */
	@After
	public void tearDown() throws Exception {
	calc=null;	
	}

	@Test
	public void testAdd() {
		double result = calc.add(10, 10);
		assertEquals(20,result,0);
	}

	@Test
	public void testSubtract() {
		double result = calc.subtract(100.5, 95);
		assertEquals(5.5,result,0);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		double result = calc.multiply(100,2.5);
		//fail("Not yet implemented");
		
		assertEquals(250,result,0);
	}

	@Test
	public void testDivide() {
		double result = calc.divide(100,10);
		assertEquals(10,result,0);
		
		//fail("Not yet implemented");
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		calc.divide(100, 0);
	}

}
