/**
 * Class Elephant extends BigGames
 * 
 * @author Gruppe222
 */
public class Elephant extends BigGame {

	/**
	 * Standard constructor
	 * 
	 * @param name
	 *            of the elephant
	 */
	public Elephant(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * @see Animal#loadTo(Section)
	 */
	@Override
	public boolean loadTo(Section s) {
		// cannot be loaded, always returns false
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see Animal#unloadFrom(Section)
	 */
	@Override
	public Animal unloadFrom(Section s) {
		// cannot be unloaded, always returns null
		return null;
	}

}
