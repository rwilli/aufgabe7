/**
 * Class Python extends Reptiles
 * 
 * @author Gruppe222
 */
public class Phyton extends Reptile {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the python
	 */
	public Phyton(String name) {
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
