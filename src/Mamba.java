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
	 * 
	 * @see Animal#unloadFrom(Section)
	 */
	// s != null
	@Override
	public boolean loadTo(Section s) {
		return s.load(this);
	}
}
