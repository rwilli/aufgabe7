/**
 * Class MambaTerrarium extends Terrarium
 * 
 * @author Gruppe222
 * 
 */
public class MambaTerrarium extends Terrarium {

	/*
	 * (non-Javadoc)
	 * 
	 * @see Terrarium#load(Mamba)
	 */
	// PRE: this.animal == null
	// POST: this.animal == m
	@Override
	public boolean load(Mamba m) {
		
		if (this.animal != null) {
			System.out.println("Mamba Terrarium is already full");
			return false;
		}
		this.animal = m;
		return true;
	}

}
