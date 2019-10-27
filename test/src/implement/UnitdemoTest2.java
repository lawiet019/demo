package implement;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitdemoTest2 {

	@Test
	public void testMultiply() {
		assertEquals(1, new Unitdemo().multiply(1,1));
	}

	@Test
	public void testDivide() {
		assertEquals(2, new Unitdemo().divide(2,1));
	}

}
