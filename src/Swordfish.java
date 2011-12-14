/**
 * Class Swordfish extends MarineLife
 * 
 * @author Gruppe222
 * 
 */
public class Swordfish extends MarineLife {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the swordfish
	 */
	// name != ""
	public Swordfish(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#unloadFrom(Section)
	 */
	// s != null
	@Override
	public boolean loadTo(Section s) {
		return s.load(this);
	}
}
