package testcode;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import buisnesscode.MyMath;

public class MyMathTest {
	private MyMath m;

	@Before
	public void setUp() throws Exception {
		 m=new MyMath();
	}
	

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testSum() {
		System.out.println("Test 1");
		assertEquals(100,m.sum(new int[] {55,10,5,20,10})); 
		//fail("Not yet implemented");
	}

}
