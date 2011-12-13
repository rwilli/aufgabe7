/**
 * Class PythonTerrarium extends Section
 * 
 * @author Gruppe222
 * 
 */
public class PhytonTerrarium extends Section {

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
	 * 
	 * @see Section#unload(Mamba)
	 */
	@Override
	public Animal unload(Mamba m) {
		this.animal = null;
		return m;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Phyton)
	 */
	@Override
	public Animal unload(Phyton p) {
		this.animal = null;
		return p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(DwarfTortoise)
	 */
	@Override
	public Animal unload(DwarfTortoise d) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(GiantTortoise)
	 */
	@Override
	public Animal unload(GiantTortoise g) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Seal)
	 */
	@Override
	public Animal unload(Seal s) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Dolphin)
	 */
	@Override
	public Animal unload(Dolphin d) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#unload(Swordfish)
	 */
	@Override
	public Animal unload(Swordfish s) {
		// TODO Auto-generated method stub
		return null;
	}

}
