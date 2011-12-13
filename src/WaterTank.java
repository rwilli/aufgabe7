/**
 * Class WaterTank extends Tank
 * 
 * @author Gruppe222
 * 
 */
public class WaterTank extends Tank {

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Dolphin)
	 */
	@Override
	public boolean load(Dolphin d) {
		this.animal = d;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Dolphin)
	 */
	@Override
	public boolean load(Swordfish s) {
		this.animal = s;
		return true;
	}

}
