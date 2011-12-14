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
	// this.animal == null
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
