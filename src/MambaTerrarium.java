/**
 * Class MambaTerrarium extends Section
 * 
 * @author Gruppe222
 * 
 */
public class MambaTerrarium extends Section {

	public boolean load(Mamba m) {
		this.animal = m;
		return true;
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

		return false;
	}

	public boolean load(Dolphin d) {

		return false;
	}

	public boolean load(Swordfish s) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see Section#unload(Mamba)
	 */
	@Override
	public Animal unload(Mamba m) {
		this.animal = null;
		return m;
	}

	/*
	 * (non-Javadoc)
	 * @see Section#unload(Phyton)
	 */
	@Override
	public Animal unload(Phyton p) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see Section#unload(DwarfTortoise)
	 */
	@Override
	public Animal unload(DwarfTortoise d) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see Section#unload(GiantTortoise)
	 */
	@Override
	public Animal unload(GiantTortoise g) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see Section#unload(Seal)
	 */
	@Override
	public Animal unload(Seal s) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see Section#unload(Dolphin)
	 */
	@Override
	public Animal unload(Dolphin d) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see Section#unload(Swordfish)
	 */
	@Override
	public Animal unload(Swordfish s) {
		return null;
	}
}
