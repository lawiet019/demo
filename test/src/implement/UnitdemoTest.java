package implement;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitdemoTest {

	@Test
	public void testAdd() {
		 assertEquals(2, new Unitdemo().add(1,1));
	}

	@Test
	public void testMinus() {
		assertEquals(0, new Unitdemo().minus(1,1));
	}

	

}
