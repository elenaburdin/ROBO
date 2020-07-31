package tests;

import robot.CharlieRobot;

public class DiagonalWalkTest {
	public static int diagonalTest(CharlieRobot robot){

		int percentage = 0;

		robot.setY(50);
        robot.setX(100);
        
        if ( robot.moveDownRight() ) {
            System.err.println( "Wrong diagonal move test for Down/Right" );
            return percentage;

        }
        percentage +=25;
       
        robot.setY(50);
        robot.setX(100);
        
        if ( robot.moveDownLeft() ) {
            System.err.println( "Wrong diagonal move test for Down/Left" );
            return percentage;

        }
         
        percentage +=25;

        robot.setY(50);
        robot.setX(0);

        if ( robot.moveUpLeft()) {
            System.err.println( "Wrong diagonal move test for Up/Left" );
            return percentage;

        }

        percentage +=25;

        robot.setY(50);
        robot.setX(0);

        if ( robot.moveDownLeft() ) {
            System.err.println( "Wrong diagonal move test for Down/Left" );
            return percentage;

        }
        percentage +=25;
        
		return percentage;

	}
}
