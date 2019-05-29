package model.entity.motionless;

import model.entity.Element;
import model.entity.IElement;
import model.entity.Permeability;
import model.entity.Sprite;

public class MotionlessElement extends Element {
	
	/**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
