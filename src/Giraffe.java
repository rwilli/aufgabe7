/**
 * Class Giraffe extends BigGame
 * 
 * @author Gruppe222
 * 
 */
public class Giraffe extends BigGame {

	/**
	 * Constructor calls the super constructor
	 * 
	 * @param name
	 *            the name of the giraffe
	 */
	// name != ""
	public Giraffe(String name) {
		super(name);
	}

	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		// always returns false, since load is impossible
		return false;
	}

}
