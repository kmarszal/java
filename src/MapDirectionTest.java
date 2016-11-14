package agh.cs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapDirectionTest {

	@Test
	public void testtoString() {
		assertEquals(MapDirection.North.toString(),"Polnoc");
		assertEquals(MapDirection.South.toString(),"Poludnie");
		assertEquals(MapDirection.East.toString(),"Wschod");
		assertEquals(MapDirection.West.toString(),"Zachod");		
	}
	
	@Test
	public void testNext() {
		assertEquals(MapDirection.North.Next(),MapDirection.East);
		assertEquals(MapDirection.South.Next(),MapDirection.West);
		assertEquals(MapDirection.East.Next(),MapDirection.South);
		assertEquals(MapDirection.West.Next(),MapDirection.North);
		
	}
	
	@Test
	public void testPrevious() {
		assertEquals(MapDirection.North.Previous(),MapDirection.West);
		assertEquals(MapDirection.South.Previous(),MapDirection.East);
		assertEquals(MapDirection.West.Previous(),MapDirection.South);
		assertEquals(MapDirection.East.Previous(),MapDirection.North);
		
	}

}