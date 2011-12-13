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

	public abstract boolean load(Mamba m);

	public abstract boolean load(Phyton p);

	public abstract boolean load(DwarfTortoise d);

	public abstract boolean load(GiantTortoise g);

	public abstract boolean load(Seal s);

	public abstract boolean load(Dolphin d);

	public abstract boolean load(Swordfish s);

	public abstract Animal unload(Mamba m);

	public abstract Animal unload(Phyton p);

	public abstract Animal unload(DwarfTortoise d);

	public abstract Animal unload(GiantTortoise g);

	public abstract Animal unload(Seal s);

	public abstract Animal unload(Dolphin d);

	public abstract Animal unload(Swordfish s);

}