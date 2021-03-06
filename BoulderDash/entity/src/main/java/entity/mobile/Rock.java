package entity.mobile;

import entity.Permeability;
import entity.Sprite;

/**
 * @author Laetitia
 *
 */
public class Rock extends Mobile {

	 /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('O', "Rock.png");

    /**
     * Instantiates a new obstacle.
     */
    public Rock() {
        super(SPRITE, Permeability.PUSHING);
    }
    
    @Override
    public void moveRight() {
    	super.moveRight();
    }
    
    @Override
    public void moveLeft() {
    	super.moveLeft();
    }
    
    @Override 
    public void moveDown() {
    	super.moveDown();
    }

	@Override
	public int getDiamonds() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}