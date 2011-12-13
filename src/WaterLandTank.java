/**
 * Class WaterLandTank extends Section
 * 
 * @author Gruppe222
 * 
 */
public class WaterLandTank extends Tank {

	public boolean load(Seal s) {
		this.animal = s;
		return true;
	}

	public boolean load(Dolphin d) {

		return false;
	}

	public boolean load(Swordfish s) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload()
	 */
	@Override
	public Animal unload() {
		Animal a = this.animal;
		this.animal = null;
		return a;
	}

}
