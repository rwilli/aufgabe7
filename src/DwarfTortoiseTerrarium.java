/**
 * Class DwarfTortoiseTerrarium extends Terrarium
 * 
 * @author Gruppe222
 * 
 */
public class DwarfTortoiseTerrarium extends Terrarium {

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
