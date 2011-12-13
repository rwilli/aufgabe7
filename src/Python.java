/**
 * Class Python extends Reptiles
 * 
 * @author Gruppe222
 */
public class Python extends Reptile {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the python
	 */
	public Python(String name) {
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
