/**
 * Class Mamba extends Reptile
 * 
 * @author Gruppe222
 */
public class Mamba extends Reptile {

	/**
	 * Constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the mamba
	 */
	// name != null
	public Mamba(String name) {
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
