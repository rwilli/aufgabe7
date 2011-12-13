/**
 * Abstract class Section
 * 
 * @author Gruppe222
 * 
 */
public abstract class Section {

	// the animal in the section, null if no animal is loaded
	protected Animal animal;

	/**
	 * Standard constructor, animal is null in the beginning
	 */
	public Section() {
		this.animal = null;
	}

	/**
	 * loads a Mamba into the section.
	 * 
	 * @param m
	 *            the mamba
	 * @return true or false depending on successful/unsuccessful load.
	 */
	public abstract boolean load(Mamba m);

	/**
	 * loads a Python into the section.
	 * 
	 * @param p
	 *            the Python
	 * @return true or false depending on successful/unsuccessful load.
	 */
	public abstract boolean load(Phyton p);

	/**
	 * loads a DwarfTortoise into the section.
	 * 
	 * @param d
	 *            the DwarfTortoise
	 * @return true or false depending on successful/unsuccessful load.
	 */
	public abstract boolean load(DwarfTortoise d);

	/**
	 * loads a GiantTortoise into the section.
	 * 
	 * @param g
	 *            the GiantTortoise
	 * @return true or false depending on successful/unsuccessful load.
	 */
	public abstract boolean load(GiantTortoise g);

	/**
	 * loads a Seal into the section.
	 * 
	 * @param s
	 *            the seal
	 * @return true or false depending on successful/unsuccessful load.
	 */
	public abstract boolean load(Seal s);

	/**
	 * loads a Dolphin into the section
	 * 
	 * @param d
	 *            the Dolphin
	 * @return true or false depending on successful/unsuccessful load.
	 */
	public abstract boolean load(Dolphin d);

	/**
	 * loads a Swordfish into the section.
	 * 
	 * @param s
	 *            the Swordfish
	 * @return true or false depending on successful/unsuccessful load.
	 */
	public abstract boolean load(Swordfish s);

	/**
	 * Unloads the animal in this section
	 * 
	 * @return the unloaded animal
	 */
	public Animal unload() {
		Animal a = this.animal;
		this.animal = null;
		return a;
	}
}