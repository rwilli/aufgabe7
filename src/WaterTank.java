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
	// PRE: this.animal == null
	// POST: this.animal = any Animal
	@Override
	public boolean load(Dolphin d) {

		if (this.animal != null) {
			System.out.println("Water Tank is already full");
			return false;
		}

		this.animal = d;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Tank#load(Dolphin)
	 */
	// PRE: this.animal == null
	// POST: this.animal = any Animal
	@Override
	public boolean load(Swordfish s) {

		if (this.animal != null) {
			System.out.println("Water Tank is already full");
			return false;
		}

		this.animal = s;
		return true;
	}

}
