package agh.cs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	@Test
	public void test() {
		assertEquals("(1,2)",new Position(1,2).toString());
	}
	
	@Test
	public void testSmaller() {
		assertTrue(new Position(1,1).smaller(new Position(1,2)));
		assertFalse(new Position(1,2).smaller(new Position(1,1)));
	}
	
	@Test
	public void testLarger() {
		assertTrue(new Position(1,2).larger(new Position(1,1)));
		assertFalse(new Position(1,1).larger(new Position(1,2)));
	}
	
	@Test
	public void testAdd() {
		assertTrue(new Position(1,1).add(new Position(1,2)).equals(new Position(2,3)));
	}
	
	@Test
	public void testEquals() {
		assertTrue(new Position(1,1).equals(new Position(1,1)));
	}
}