/**
 * Abstract class Animal
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
	// name != ""
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
	// s != null
	public abstract boolean loadTo(Section s);

	@Override
	public String toString() {
		return "name=" + name ;
	}

}
