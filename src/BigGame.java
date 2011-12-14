/**
 * Abstract class BigGame extends Animal
 * 
 * @author Gruppe222
 */
public abstract class BigGame extends Animal {

	/**
	 * Constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the BigGame
	 */
	// name != ""
	public BigGame(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#loadTo(Section)
	 */

	// PRE: s != null
	// POST: always returns false, because BigGame cannot be loaded
	@Override
	public boolean loadTo(Section s) {

		// cannot be loaded, always returns false.
		return false;
	}

}
