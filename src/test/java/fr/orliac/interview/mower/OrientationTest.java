package fr.orliac.interview.mower;

import junit.framework.TestCase;

public class OrientationTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testLeftOfNorthShouldBeWest() {
		Orientation o = Orientation.NORTH;
		assertSame(o.left(), Orientation.WEST);
	}
	
	public void testLOfWestShouldBeSouth() {
		Orientation o = Orientation.WEST;
		assertSame(o.left(), Orientation.SOUTH);
	}
	
	public void testLOfSouthShouldBeEast() {
		Orientation o = Orientation.SOUTH;
		assertSame(o.left(), Orientation.EAST);
	}

	public void testLOfEastShouldBeNorth() {
		Orientation o = Orientation.EAST;
		assertSame(o.left(), Orientation.NORTH);
	}
	
	
	public void testRightOfNorthShouldBeEast() {
		Orientation o = Orientation.NORTH;
		assertSame(o.right(), Orientation.EAST);
	}
	
	public void testRightOfEastShouldBeSouth() {
		Orientation o = Orientation.EAST;
		assertSame(o.right(), Orientation.SOUTH);
	}
	
	public void testRightOfSouthShouldBeWest() {
		Orientation o = Orientation.SOUTH;
		assertSame(o.right(), Orientation.WEST);
	}

	public void testRightOfWestShouldBeNorth() {
		Orientation o = Orientation.WEST;
		assertSame(o.right(), Orientation.NORTH);
	}
}
