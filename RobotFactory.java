package robot;

public class RobotFactory {

	public static AbstractRobot getRobot(String name, String model ) {
	
		if (model.equals("Alpha")) 
			 return new AlphaRobot(name, model);  

		if (model.equals("Beta")) 
	            return new BetaRobot(name, model);

		if (model.equals("Charlie")) 
	            return new BetaRobot(name, model);
	    
		return null;      
    }

}
