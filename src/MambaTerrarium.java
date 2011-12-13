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
	@Override
	public boolean load(Mamba m) {
		this.animal = m;
		return true;
	}

}
