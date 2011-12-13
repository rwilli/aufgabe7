/**
 * Class Giraffe extends BigGame
 * 
 * @author Gruppe222
 * 
 */
public class Giraffe extends BigGame {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the giraffe
	 */
	public Giraffe(String name) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#unloadFrom(Section)
	 */
	@Override
	public Animal unloadFrom(Section s) {
		// animal cannot be unloaded, always returns null
		return null;
	}

}
