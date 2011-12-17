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

	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		return t.sections[section].load(this);
	}

}
