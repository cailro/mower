package fr.orliac.interview.mower;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EngineTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public EngineTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( EngineTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		Engine engine = new Engine();

		List<Action> mowerOneCommands = new ArrayList<>();
		mowerOneCommands.add(Action.LEFT);
		mowerOneCommands.add(Action.MOVE);
		mowerOneCommands.add(Action.LEFT);
		mowerOneCommands.add(Action.MOVE);
		mowerOneCommands.add(Action.LEFT);
		mowerOneCommands.add(Action.MOVE);
		mowerOneCommands.add(Action.LEFT);
		mowerOneCommands.add(Action.MOVE);
		mowerOneCommands.add(Action.MOVE);

		Mower m1 = new Mower(new Coords(1, 2), Orientation.NORTH, new Coords(5, 5));
		m1.setCommands(mowerOneCommands);

		engine.addMower(m1);


		List<Action> mowerTwoCommands = new ArrayList<>();
		mowerTwoCommands.add(Action.MOVE);
		mowerTwoCommands.add(Action.MOVE);
		mowerTwoCommands.add(Action.RIGHT);
		mowerTwoCommands.add(Action.MOVE);
		mowerTwoCommands.add(Action.MOVE);
		mowerTwoCommands.add(Action.RIGHT);
		mowerTwoCommands.add(Action.MOVE);
		mowerTwoCommands.add(Action.RIGHT);
		mowerTwoCommands.add(Action.RIGHT);
		mowerTwoCommands.add(Action.MOVE);

		Mower m2 = new Mower(new Coords(3, 3), Orientation.EAST, new Coords(5, 5));
		m2.setCommands(mowerTwoCommands); 
		engine.addMower(m2);

		engine.launch();
	}
}
