package main;



import robot.AbstractRobot;
import robot.AlphaRobot;
import robot.BetaRobot;
import robot.CharlieRobot;
import robot.RobotFactory;
import tests.SimpleTest;
import tests.ChargeTest;
import tests.DiagonalWalkTest;


public class Application {

	public static void main(String[] args) {
    
		AbstractRobot robo = RobotFactory.getRobot("Beta","Bobo");
	 

	//System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
	System.out.printf("Charge test passed %d%%\n", ChargeTest.chargeTest((BetaRobot)robo));

	//System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new BetaRobot("Robo","beta") ) );
	//System.out.printf("Diagonal test passed %d%%\n", DiagonalWalkTest.diagonalTest( new CharlieRobot ("Charlie","betaCharlie") ) ); 



	}

}
