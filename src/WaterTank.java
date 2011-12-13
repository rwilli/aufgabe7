/**
 * Class WaterTank extends Tank
 * 
 * @author Gruppe222
 * 
 */
public class WaterTank extends Tank {

	public boolean load(Seal s) {
		this.animal = s;
		return true;
	}

	public boolean load(Dolphin d) {
		this.animal = d;
		return true;
	}

	public boolean load(Swordfish s) {
		this.animal = s;
		return true;
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
