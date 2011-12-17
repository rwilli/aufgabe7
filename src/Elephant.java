/**
 * Class Elephant extends BigGames
 * 
 * @author Gruppe222
 */
public class Elephant extends BigGame {

	/**
	 * Constructor calls the super constructor
	 * 
	 * @param name
	 *            of the elephant
	 */
	// name != ""
	public Elephant(String name) {
		super(name);
	}

	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		// always returns false, this load is impossible
		return false;
	}


}
