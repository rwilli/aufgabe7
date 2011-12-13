/**
 * Class WaterLandTank extends Section
 * 
 * @author Gruppe222
 * 
 */
public class WaterLandTank extends Tank {

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Seal)
	 */
	@Override
	public boolean load(Seal s) {
		this.animal = s;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Seal)
	 */
	@Override
	public boolean load(Dolphin d) {

		this.animal = d;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Seal)
	 */
	@Override
	public boolean load(Swordfish s) {

		this.animal = s;
		return true;
	}

}
