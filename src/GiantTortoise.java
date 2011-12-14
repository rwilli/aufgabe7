/**
 * Class GiantTortoise extends Reptile
 * 
 * @author Gruppe222
 * 
 */
public class GiantTortoise extends Reptile {

	/**
	 * Constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the GiantTortoise
	 */
	// name != ""
	public GiantTortoise(String name) {
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
