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
	// this.animal == null
	@Override
	public boolean load(Seal s) {

		if (this.animal != null) {
			System.out.println("Water/Land Tank is already full");
			return false;
		}

		this.animal = s;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Seal)
	 */
	// this.animal == null
	@Override
	public boolean load(Dolphin d) {

		if (this.animal != null) {
			System.out.println("Water/Land Tank is already full");
			return false;
		}

		this.animal = d;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Seal)
	 */
	// this.animal == null
	@Override
	public boolean load(Swordfish s) {

		if (this.animal != null) {
			System.out.println("Water/Land Tank is already full");
			return false;
		}

		this.animal = s;
		return true;
	}

}
