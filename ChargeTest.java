package tests;

import robot.BetaRobot;

public class ChargeTest {

	public static int chargeTest(BetaRobot robot) {
		
		int percentage =  0;
		
		robot.setCharge(-100);
	    if( robot.getCharge() < 0 ) {
	    	System.err.println( "Error charge: less than 100%" );
	    	return percentage;
        }

        
        robot.setCharge(1000);
        if( robot.getCharge() > 100 ) {
	    	System.err.println( "Error charge: more than 100%" );
	    	return percentage;
        }

       
        robot.setCharge(50);
        if( robot.moveRight() ) {	
        } else if( robot.getCharge() < 5 ) {
        	System.err.println( "Again error" );
	        return percentage;

        }
		return percentage; 
   }

}