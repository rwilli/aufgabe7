/**
 * Class Dolphin extends MarineLife
 * 
 * @author Gruppe222
 * 
 */
public class Dolphin extends MarineLife {

	/**
	 * Constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the dolphin
	 */
	// name != ""
	public Dolphin(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#loadTo(Section)
	 */
	// s != null
	@Override
	public boolean loadTo(Section s) {
		return s.load(this);
	}

}
