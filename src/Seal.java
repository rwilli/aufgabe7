/**
 * Class Seal extends MarineLife
 * 
 * @author Gruppe222
 * 
 */
public class Seal extends MarineLife {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the seal
	 */
	// name != ""
	public Seal(String name) {
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
