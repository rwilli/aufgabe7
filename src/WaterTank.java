/**
 * Class WaterTank extends Section
 * 
 * @author Gruppe222
 * 
 */
public class WaterTank extends Section {

	public boolean load(Mamba m) {
		return false;

	}

	public boolean load(Phyton p) {
		return false;

	}

	public boolean load(DwarfTortoise d) {

		return false;

	}

	public boolean load(GiantTortoise g) {

		return false;
	}

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
	 * @see Section#unload(Mamba)
	 */
	@Override
	public Animal unload(Mamba m) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Phyton)
	 */
	@Override
	public Animal unload(Phyton p) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(DwarfTortoise)
	 */
	@Override
	public Animal unload(DwarfTortoise d) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(GiantTortoise)
	 */
	@Override
	public Animal unload(GiantTortoise g) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Seal)
	 */
	@Override
	public Animal unload(Seal s) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Dolphin)
	 */
	@Override
	public Animal unload(Dolphin d) {
		this.animal = null;
		return d;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Swordfish)
	 */
	@Override
	public Animal unload(Swordfish s) {
		this.animal = null;
		return s;
	}

}
