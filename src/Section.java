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

	public abstract Animal unload();
}