/**
 * Abstract animal class
 * 
 * @author Gruppe222
 */
public abstract class Animal {

	// every animal has a name
	protected String name;

	/**
	 * Standard constructor
	 * 
	 * @param name
	 *            the name of the animal
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * This method should be implemented by subtypes
	 * 
	 * @param s
	 *            the section to load to
	 * @return true or false depending on successful or unsuccessful load
	 */
	public abstract boolean loadTo(Section s);

}
