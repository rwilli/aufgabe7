/**
 * Abstract class BigGame extends Animal
 * 
 * @author Gruppe222
 */
public abstract class BigGame extends Animal {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the BigGame
	 */
	public BigGame(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#loadTo(Section)
	 */
	@Override
	public boolean loadTo(Section s) {

		// cannot be loaded, always returns false.
		return false;
	}

}
