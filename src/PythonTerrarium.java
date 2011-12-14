/**
 * Class PythonTerrarium extends Terrarium
 * 
 * @author Gruppe222
 * 
 */
public class PythonTerrarium extends Terrarium {

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
			System.out.println("Python Terrarium is already full");
			return false;
		}

		this.animal = m;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Terrarium#load(Mamba)
	 */
	// PRE: this.animal == null
	// POST: this.animal == p
	@Override
	public boolean load(Python p) {

		if (this.animal != null) {
			System.out.println("Python Terrarium is already full");
			return false;
		}

		this.animal = p;
		return true;
	}

}
