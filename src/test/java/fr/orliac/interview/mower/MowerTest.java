package fr.orliac.interview.mower;

import junit.framework.TestCase;

public class MowerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testGoFoward() {
		
		Mower mower = new Mower(new Coords(0, 0), Orientation.NORTH, new Coords(5, 5));
			
		// move in y direction
		mower.goFoward();
		Coords expectedCoords = new Coords(0, 1);
		Orientation expectedOrientation = Orientation.NORTH;

		assertSame(expectedOrientation , mower.getOrientation());
		assertEquals(expectedCoords.getX() , mower.getCoords().getX());
		assertEquals(expectedCoords.getY() , mower.getCoords().getY());
		
		// if the move is outside the bound, we ignore the action
		mower.turnLeft();
		mower.goFoward();
		
		expectedCoords = new Coords(0, 1);
		expectedOrientation = Orientation.WEST;
		
		assertSame(expectedOrientation , mower.getOrientation());
		assertEquals(expectedCoords.getX() , mower.getCoords().getX());
		assertEquals(expectedCoords.getY() , mower.getCoords().getY());
		
		//move in x direction
		mower.turnLeft();
		mower.turnLeft();
		mower.goFoward();
		
		expectedCoords = new Coords(1, 1);
		expectedOrientation = Orientation.EAST;
		
		assertSame(expectedOrientation , mower.getOrientation());
		assertEquals(expectedCoords.getX() , mower.getCoords().getX());
		assertEquals(expectedCoords.getY() , mower.getCoords().getY());
			
	}

}
