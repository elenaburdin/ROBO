package robot;

public class BetaRobot extends AlphaRobot{
	
    private int charge;

	// constructor
	protected BetaRobot() {}

	public BetaRobot( String name, String model ) {
		super(name, model);
        setCharge(0);
	}
	
	public void setCharge(int charge) {
		if( charge >= 0 && charge<= 100 )
		this.charge = charge;
		else  
			System.out.println( "Wrong charge" );
	}
	public int getCharge() {
		return charge;
	}
	
	
	// Moves

			public boolean moveRight() {
				int newX = charge + 1;
				if( Coordinates (newX) ) {
				setX(newX);
				return true;

			}
				else 
					return false;

			}

			 public boolean moveLeft() {
			    int newX = charge -1;
			    if( Coordinates (newX) ) {
				setX(newX);
				return true;

			}
				else 
					return false;

			}

			 public boolean moveDown() {
			    int newY = charge +1;
			    if( Coordinates (newY) ) {
				setY(newY);
					return true;
				}
				else 
					return false; 
			    }

			    

			 public boolean moveUp() {
			    int newY = charge -1;
			    if( Coordinates (newY) ) {
				setY(newY);
					return true;
				}
				else 
					return false; 
			    }

			 
			   protected static boolean Coordinates (int coordinate) {
			    	return (coordinate >= 0 && coordinate <=100);

			    }

}
