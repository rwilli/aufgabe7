/**
 * Class GiantTortoiseTerrarium extends Terrarium
 * 
 * @author Gruppe222
 */
public class GiantTortoiseTerrarium extends Terrarium {

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
			System.out.println("Giant Tortoise Terrarium is already full");
			return false;
		}
		this.animal = d;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Terrarium#load(DwarfTortoise)
	 */
	// PRE: this.animal == null
	// POST: this.animal == g
	@Override
	public boolean load(GiantTortoise g) {

		if (this.animal != null) {
			System.out.println("Giant Tortoise Terrarium is already full");
			return false;
		}
		
		this.animal = g;
		return true;
	}

}