/**
 * Class GiantTortoiseTerrarium extends Terrarium
 * 
 * @author Gruppe222
 */
public class GiantTortoiseTerrarium extends Terrarium {

	/**
	 * load Mamba is not possible
	 */
	public boolean load(Mamba m) {
		return false;

	}

	public boolean load(Phyton p) {
		return false;
	}

	public boolean load(DwarfTortoise d) {

		this.animal = d;
		return true;
	}

	public boolean load(GiantTortoise g) {

		this.animal = g;
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