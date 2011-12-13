/**
 * Abstract class Tank extends Section
 * 
 * @author Gruppe222
 */
public abstract class Tank extends Section {

	/**
	 * Standard constructor calls the super constructor
	 */
	public Tank() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Seal)
	 */
	@Override
	public boolean load(Seal s) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Seal)
	 */
	@Override
	public boolean load(Dolphin d) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Seal)
	 */
	@Override
	public boolean load(Swordfish s) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Seal)
	 */
	@Override
	public boolean load(Mamba m) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Seal)
	 */
	@Override
	public boolean load(Phyton p) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Seal)
	 */
	@Override
	public boolean load(DwarfTortoise d) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Seal)
	 */
	@Override
	public boolean load(GiantTortoise g) {

		return false;
	}
}
