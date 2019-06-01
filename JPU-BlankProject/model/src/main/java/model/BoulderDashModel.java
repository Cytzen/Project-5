package model ;

import java.io.IOException;
import java.util.Observable;


import contract.IModel;
import entity.IMap;
import entity.mobile.IMobile;
import entity.mobile.MyPlayer;


/**
 * <h1>The Class InsaneVehiclesModel.</h1>
 */
public class BoulderDashModel implements IModel {

    /** The road. */
    private IMap map;

    /** The my vehicle. */
    private IMobile myPlayer;
    
    private IMobile Monster;

    /**
     * Instantiates a new insane vehicles model.
     *
     * @param fileName
     *            the file name
     * @param myVehicleStartX
     *            the my vehicle start X
     * @param myVehicleStartY
     *            the my vehicle start Y
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public BoulderDashModel(final String fileName, final int myPlayerStartX, final int myPlayerStartY)
            throws IOException {
        this.setMap(new Map(fileName));
        this.setMyPlayer(new MyPlayer(myPlayerStartX, myPlayerStartY, this.getMap()));
        
    }

    /* (non-Javadoc)
     * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getRoad()
     */
    @Override
    public final IMap getMap() {
        return this.map;
    }

    private void setMap(final IMap map) {
        this.map = map;
    }

    /* (non-Javadoc)
     * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getMyVehicle()
     */
    
    @Override
    public final  IMobile getMyPlayer() {
        return this.myPlayer;
    }
    
    private void setMyPlayer(final IMobile myPlayer) {
        this.myPlayer = myPlayer;
    }

	public final IMobile getMonster() {
		return this.Monster;
	}

	public void setMonster(IMobile monster) {
		this.Monster = monster;
	}

	

}