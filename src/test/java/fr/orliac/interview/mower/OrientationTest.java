package fr.orliac.interview.mower;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrientationTest {

	@Test
	public void leftOfNorthShouldBeWest() {
		Orientation o = Orientation.NORTH;
		Assert.assertSame(o.left(), Orientation.WEST);
	}
	
	@Test
	public void leftOfWestShouldBeSouth() {
		Orientation o = Orientation.WEST;
		Assert.assertSame(o.left(), Orientation.SOUTH);
	}
	
	@Test
	public void leftOfSouthShouldBeEast() {
		Orientation o = Orientation.SOUTH;
		Assert.assertSame(o.left(), Orientation.EAST);
	}

	@Test
	public void leftOfEastShouldBeNorth() {
		Orientation o = Orientation.EAST;
		Assert.assertSame(o.left(), Orientation.NORTH);
	}
	
	
	@Test
	public void rightOfNorthShouldBeEast() {
		Orientation o = Orientation.NORTH;
		Assert.assertSame(o.right(), Orientation.EAST);
	}
	
	@Test
	public void rightOfEastShouldBeSouth() {
		Orientation o = Orientation.EAST;
		Assert.assertSame(o.right(), Orientation.SOUTH);
	}
	
	@Test
	public void rightOfSouthShouldBeWest() {
		Orientation o = Orientation.SOUTH;
		Assert.assertSame(o.right(), Orientation.WEST);
	}

	@Test
	public void rightOfWestShouldBeNorth() {
		Orientation o = Orientation.WEST;
		Assert.assertSame(o.right(), Orientation.NORTH);
	}
}
