package LargestG;

import static org.junit.Assert.*;

import org.junit.Test;

class LargestTest {

	@Test
	void testLargest() {
//		fail("Not yet implemented");
		assertEquals(9, Largest.lagest(new int[] {7, 8, 9}));
	}
	
	@Test
	void testL1() {
		assertEquals(9, Largest.lagest(new int[] {9, 8, 7}));
	}
	
	@Test
	void testL2() {
		assertEquals(9, Largest.lagest(new int[] {8, 9, 7}));
	}

}
