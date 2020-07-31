package robot;

public class RobotFactory {

	public static AbstractRobot getRobot(String name, String model ) {
	
		if (model.equals("Alpha")) 
			 return new AlphaRobot(name, model);  

		else if (model.equals("Beta")) 
	            return new BetaRobot(name, model);

		else if (model.equals("Charlie")) 
	            return new BetaRobot(name, model);
	    
		return null;      
    }

}
