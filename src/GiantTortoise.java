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

	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		return t.sections[section].load(this);
	}
}
