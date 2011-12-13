/**
 * Class GiantTortoise extends Reptile
 * 
 * @author Gruppe222
 * 
 */
public class GiantTortoise extends Reptile {

	/**
	 * Standard constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the GiantTortoise
	 */
	public GiantTortoise(String name) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#unloadFrom(Section)
	 */
	@Override
	public Animal unloadFrom(Section s) {
		s.unload(this);
		return this;
	}
}
