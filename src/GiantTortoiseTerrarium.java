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
	@Override
	public boolean load(DwarfTortoise d) {

		this.animal = d;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Terrarium#load(DwarfTortoise)
	 */
	@Override
	public boolean load(GiantTortoise g) {

		this.animal = g;
		return true;
	}

}