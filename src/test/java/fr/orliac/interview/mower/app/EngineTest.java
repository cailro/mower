package fr.orliac.interview.mower.app;

import fr.orliac.interview.mower.Action;
import fr.orliac.interview.mower.Coordinate;
import fr.orliac.interview.mower.Orientation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class EngineTest {

    @Test
    public void launch() throws Exception {

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

        Mower m1 = new Mower(new Coordinate(1, 2), Orientation.NORTH, new Coordinate(5, 5));
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

        Mower m2 = new Mower(new Coordinate(3, 3), Orientation.EAST, new Coordinate(5, 5));
        m2.setCommands(mowerTwoCommands);
        engine.addMower(m2);

        engine.launch();
    }

}