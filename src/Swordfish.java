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
	 * @see Animal#loadOnto(Transporter, java.lang.Integer)
	 */
	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		return t.sections[section].load(this);
	}
}
