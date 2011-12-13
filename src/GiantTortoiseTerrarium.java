/**
 * Class GiantTortoiseTerrarium extends Section
 * 
 * @author Gruppe222
 */
public class GiantTortoiseTerrarium extends Section {

	/**
	 * load Mamba is not possible
	 */
	public boolean load(Mamba m) {
		return false;

	}

	public boolean load(Phyton p) {
		return false;

	}

	public boolean load(DwarfTortoise d) {

		this.animal = d;
		return true;
	}

	public boolean load(GiantTortoise g) {

		this.animal = g;
		return true;
	}

	public boolean load(Seal s) {

		return false;
	}

	public boolean load(Dolphin d) {

		return false;
	}

	public boolean load(Swordfish s) {

		return false;
	}

	@Override
	public Animal unload(Mamba m) {
		return null;
	}

	@Override
	public Animal unload(Phyton p) {
		return null;
	}

	@Override
	public Animal unload(DwarfTortoise d) {
		this.animal = null;
		return d;
	}

	@Override
	public Animal unload(GiantTortoise g) {
		this.animal = null;
		return g;
	}

	@Override
	public Animal unload(Seal s) {
		return null;
	}

	@Override
	public Animal unload(Dolphin d) {
		return null;
	}

	@Override
	public Animal unload(Swordfish s) {
		return null;
	}

}
