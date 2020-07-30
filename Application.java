package main;



import robot.AbstractRobot;
import robot.AlphaRobot;
import robot.BetaRobot;
import robot.RobotFactory;
import tests.SimpleTest;

public class Application {

	public static void main(String[] args) {
    

	System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot(null,"alpha") ) );
	
	System.out.println();
	System.out.println();
	
	System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new BetaRobot("Bobik","beta") ) );

	}

}
