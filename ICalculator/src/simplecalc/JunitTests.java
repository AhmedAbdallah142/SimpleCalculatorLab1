package simplecalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import simplecalc.Calculator;

public class JunitTests {
	Calculator test = new Calculator();
	@Test
	public void AddTest() {
		
		assertEquals(110, test.add(10,100));
	    assertEquals(10, test.add(0, 10));
	    assertEquals(10, test.add(10,0));
	    assertEquals(3, test.add(1,2));
	}
	
	@Test
	public void DivideTest() {
		assertEquals(1, test.divide(100,100),0);
		assertEquals(0.8F, test.divide(4,5),0);
		assertEquals(0.5, test.divide(1,2),0);
		try {
			test.divide(2,0);
		}catch (RuntimeException r) {
			System.out.println(r.toString());
		}
	}
}
