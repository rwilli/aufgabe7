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
	@Override
	public boolean load(DwarfTortoise d) {

		if (this.animal != null) {
			System.out.println("DwarfTortoiseTerrarium is already full");
			return false;
		}
		this.animal = d;
		return true;
	}

}
