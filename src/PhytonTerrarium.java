/**
 * Class PythonTerrarium extends Terrarium
 * 
 * @author Gruppe222
 * 
 */
public class PhytonTerrarium extends Terrarium {

	public boolean load(Mamba m) {
		this.animal = m;
		return true;
	}

	public boolean load(Phyton p) {
		this.animal = p;
		return true;
	}

	public boolean load(DwarfTortoise d) {

		return false;
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
