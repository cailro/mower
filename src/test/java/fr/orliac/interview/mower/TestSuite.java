package fr.orliac.interview.mower;

import fr.orliac.interview.mower.app.EngineTest;
import fr.orliac.interview.mower.app.MowerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({OrientationTest.class, MowerTest.class, EngineTest.class})
public class TestSuite {
}
