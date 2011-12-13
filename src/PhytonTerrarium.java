/**
 * Class PythonTerrarium extends Terrarium
 * 
 * @author Gruppe222
 * 
 */
public class PhytonTerrarium extends Terrarium {

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see Terrarium#load(Mamba)
	 */
	@Override
	public boolean load(Phyton p) {
		this.animal = p;
		return true;
	}

}
