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
	public DwarfTortoise(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Animal#loadTo(Section)
	 */
	@Override
	public boolean loadTo(Section s) {
		return s.load(this);
	}
}
