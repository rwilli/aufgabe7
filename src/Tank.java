/**
 * Abstract class Tank extends Section
 * 
 * @author Gruppe222
 */
public abstract class Tank extends Section {

	public Tank() {
		super();
	}

	public boolean load(Mamba m) {
		return false;
	}

	public boolean load(Phyton p) {
		return false;
	}

	public boolean load(DwarfTortoise d) {

		return false;
	}

	public boolean load(GiantTortoise g) {

		return false;
	}

}
