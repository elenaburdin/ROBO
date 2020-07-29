package main;

import robot.AbstractRobot;
import robot.AlphaRobot;
import robot.RobotFactory;
import tests.SimpleTest;

public class Application {

	public static void main(String[] args) {
	
		
		AbstractRobot robo = RobotFactory.getRobot("beta","Bobo"); 
        
		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );

	}

}
