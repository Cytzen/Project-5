package model.entity.mobile;

import java.io.IOException;

import contract.IMap;
import model.entity.Permeability;
import model.entity.Sprite;

/**
 * <h1>The MyVehicle Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public class MyPlayer extends Mobile {

	/** The Constant SPRITE. */
	private static final Sprite sprite = new Sprite('H', "Down.png");

	/** The Constant spriteTurnLeft. */
	private static final Sprite spriteTurnLeft = new Sprite('H', "Left.png");

	/** The Constant spriteTurnRight. */
	private static final Sprite spriteTurnRight = new Sprite('H', "Right.png");
	
	private static final Sprite spriteTurnUp = new Sprite('H', "Up.png");

	private static final Sprite spriteTurnDown = new Sprite('H', "Down.png");


	/** The Constant spriteExplode. */
	private static final Sprite spriteExplode = new Sprite('H', "Dead.png");

	/**
	 * Instantiates a new my vehicle.
	 *
	 * @param x    the x
	 * @param y    the y
	 * @param map the map
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public MyPlayer(final int x, final int y, final IMap map) throws IOException {
		super(x, y, sprite, map, Permeability.BLOCKING);
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteTurnUp.loadImage();
		spriteTurnDown.loadImage();
		spriteExplode.loadImage();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
	 */
	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteTurnLeft);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
	 */
	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteTurnRight);
	}
	public final void moveDown() {
		super.moveDown();
		this.setSprite(spriteTurnDown);
	}
	public final void moveUp() {
		super.moveUp();
		this.setSprite(spriteTurnUp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
	 */
	@Override
	protected final void die() {
		super.die();
		this.setSprite(spriteExplode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
	 */
	@Override
	public final void doNothing() {
		super.doNothing();
		this.setSprite(sprite);
	}
}
