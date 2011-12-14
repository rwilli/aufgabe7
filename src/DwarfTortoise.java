/**
 * Class DwarfTortoise extends Reptile
 * 
 * @author Gruppe222
 * 
 */
public class DwarfTortoise extends Reptile {

	/**
	 * Constructor calls the super constructor.
	 * 
	 * @param name
	 *            the name of the DwarfTortoise
	 */
	// name != null
	public DwarfTortoise(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#loadTo(Section)
	 */
	
	// s != null
	@Override
	public boolean loadTo(Section s) {
		return s.load(this);
	}
}
