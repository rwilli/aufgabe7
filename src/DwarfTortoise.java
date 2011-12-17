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

	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		return t.sections[section].load(this);
	}
}
