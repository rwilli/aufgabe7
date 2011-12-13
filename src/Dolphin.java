/**
 * Class Dolphin extends MarineLife
 * 
 * @author Gruppe222
 * 
 */
public class Dolphin extends MarineLife {

	/**
	 * Standard constructor
	 * 
	 * @param name
	 *            the name of the dolphin
	 */
	public Dolphin(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#loadTo(Section)
	 */
	@Override
	public boolean loadTo(Section s) {
		return s.load(this);
	}

}
