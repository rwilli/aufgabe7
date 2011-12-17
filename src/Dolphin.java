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
	 * @see Animal#loadOnto(Transporter, java.lang.Integer)
	 */
	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		return t.sections[section].load(this);
	}

}
