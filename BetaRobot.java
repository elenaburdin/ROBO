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

	@Override
	public boolean moveRight() {
       if(checkCharge() && super.moveRight()) {
    	   setX(getX() + 1);
           charge--;
		 return true;
       }else {
    	   return false;
       }

    }

	@Override
	public boolean moveLeft() {
		if(checkCharge() && super.moveLeft()) {
			setX(getX() - 1);
            charge--;
		 return true;

       }else {
    	   return false;
       }

	}

	@Override
	public boolean moveDown() {
		if(checkCharge() && super.moveDown()) {
			setY(getY() + 1);
            charge--;
		 return true;
		 
       }else {
    	   return false;

       }

	}

	@Override
	public boolean moveUp() {
		if(checkCharge() && super.moveUp()) {
			setY(getY() -1);
            charge--;
		 return true;

       }else {
    	   return false;

       }

	}

	public boolean checkCharge(){
        if(getCharge() >= 5 ) {
        	return true;

        }else {
        	return false;

        }

     }

}