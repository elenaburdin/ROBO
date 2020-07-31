package robot;

public class AlphaRobot extends AbstractRobot{

	private String name;
	private String model;
	private int x;
	private int y;
	
	// Constructor
protected AlphaRobot() {}

	public AlphaRobot( String name, String model ) {
		setName(name);
		setModel(model);
		setY(0);

        setX(0);
	}
	
	
	// get and set for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
			this.name = name;

	}
		//else 
			//System.out.println( "Wrong name" );

	
	// get and set for model
	public String getModel() {
		return model;
	}
	public void setModel( String model ) {
		if( model != null )
		this.model = model;
		//else
			//System.out.println( "Wrong model" );
	}
	
	// get and set for X
	public int getX() {
		return x;
	}
	public void setX( int x ) {
		if(x >= 0 && x <= 100)
		this.x = x;
		//else  
			//System.out.println( "Wrong coordinates" );
	} 
	
	// get and set for Y
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(y >= 0 && y <= 100)
		this.y = y;
		//else  
			//System.out.println( "Wrong coordinates");
	}
	// Moves

		public boolean moveRight() {
			int newX = x+1;
			if( validateCoordinates (newX) ) {
			setX(newX);
			return true;

		}
			else 
				return false;

		}

		 public boolean moveLeft() {
		    int newX = x-1;
		    if( validateCoordinates(newX) ) {
			setX(newX);
			return true;

		}
			else 
				return false;

		}

		 public boolean moveDown() {
		    int newY = y+1;
		    if( validateCoordinates (newY) ) {
			setY(newY);
				return true;
			}
			else 
				return false; 
		    }

		    

		 public boolean moveUp() {
		    int newY = y-1;
		    if( validateCoordinates (newY) ) {
			setY(newY);
				return true;
			}
			else 
				return false; 
		    }

		 
		   protected static boolean validateCoordinates  (int coordinate) {
		    	return (coordinate >= 0 && coordinate <=100);

		    }

}
