/**
 * Class Mamba extends Reptile
 * 
 * @author Gruppe222
 */
public class Mamba extends Reptile {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the mamba
	 */
	public Mamba(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#unloadFrom(Section)
	 */
	@Override
	public boolean loadTo(Section s) {
		return s.load(this);
	}
}
