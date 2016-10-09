package fr.orliac.interview.mower.app;

import fr.orliac.interview.mower.Coordinate;
import fr.orliac.interview.mower.Orientation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MowerTest {

	private Mower mower;

	@Before
	public void setUp() throws Exception {
		mower = new Mower(new Coordinate(0, 0), Orientation.NORTH, new Coordinate(5, 5));
	}

	@Test
	public void mowerShouldGoFowardInYDirection() {
        // move in y direction
        mower.moveForward();

        Coordinate expectedCoordinate = new Coordinate(0, 1);
        Orientation expectedOrientation = Orientation.NORTH;

        Assert.assertSame(expectedOrientation, mower.getOrientation());
        Assert.assertEquals(expectedCoordinate.getX(), mower.getCoordinate().getX());
        Assert.assertEquals(expectedCoordinate.getY(), mower.getCoordinate().getY());
    }

    @Test
    public void mowerShouldGoFowardInXDirection() {
        //move in x direction
        mower.turnRight();
        mower.moveForward();

        Coordinate expectedCoordinate = new Coordinate(1, 0);
        Orientation expectedOrientation = Orientation.EAST;

        Assert.assertSame(expectedOrientation, mower.getOrientation());
        Assert.assertEquals(expectedCoordinate.getX(), mower.getCoordinate().getX());
        Assert.assertEquals(expectedCoordinate.getY(), mower.getCoordinate().getY());

    }

    @Test
    public void mowerShouldIgnoreTheMoveAction() {
        // if the move is outside the bound, we ignore the action
        mower.turnLeft();
        mower.moveForward();

        Coordinate expectedCoordinate = new Coordinate(0, 0);
        Orientation expectedOrientation = Orientation.WEST;

        Assert.assertSame(expectedOrientation, mower.getOrientation());
        Assert.assertEquals(expectedCoordinate.getX(), mower.getCoordinate().getX());
        Assert.assertEquals(expectedCoordinate.getY(), mower.getCoordinate().getY());
    }

}
