/**
 * Abstract class Terrarium extends Section
 * 
 * @author Gruppe222
 * 
 */
public abstract class Terrarium extends Section {

	/**
	 * Standard constructor calls the super constructor
	 */
	public Terrarium() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Mamba)
	 */
	@Override
	public boolean load(Mamba m) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Mamba)
	 */
	@Override
	public boolean load(Python p) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Mamba)
	 */
	@Override
	public boolean load(DwarfTortoise d) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Mamba)
	 */
	@Override
	public boolean load(GiantTortoise g) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Mamba)
	 */
	@Override
	public boolean load(Seal s) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Mamba)
	 */
	@Override
	public boolean load(Dolphin d) {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Section#load(Mamba)
	 */
	@Override
	public boolean load(Swordfish s) {

		return false;
	}

}
