/**
 * Class DwarfTortoiseTerrarium extends Terrarium
 * 
 * @author Gruppe222
 * 
 */
public class DwarfTortoiseTerrarium extends Terrarium {

	/*
	 * (non-Javadoc)
	 * 
	 * @see Terrarium#load(DwarfTortoise)
	 */
	// PRE: this.animal == null
	// POST: this.animal == d
	@Override
	public boolean load(DwarfTortoise d) {

		if (this.animal != null) {
			System.out.println("Dwarf Tortoise Terrarium is already full");
			return false;
		}
		this.animal = d;
		return true;
	}

}
