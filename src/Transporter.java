import java.util.Iterator;
import java.util.LinkedList;

public class Transporter {
	
	final protected Section[] sections;
	final protected TrailerCoupling[] couplings;
	final protected int id;

	// id > 0
	// number of sections == 6
	// couplings.length == 3
	public Transporter(int id) {
		this.id = id;

		sections = new Section[6];
		sections[0] = new WaterTank();
		sections[1] = new WaterLandTank();
		sections[2] = new PythonTerrarium();
		sections[3] = new MambaTerrarium();
		sections[4] = new GiantTortoiseTerrarium();
		sections[5] = new DwarfTortoiseTerrarium();

		couplings = new TrailerCoupling[3];
		couplings[0] = new TrailerCoupling(1);
		couplings[1] = new TrailerCoupling(2);
		couplings[2] = new TrailerCoupling(3);

		// On the first two couplings are BigGames
		BigGame tmp = new Giraffe("Giraffe at " + id);
		couplings[0].load(tmp);
		tmp = new Elephant("Elephant at " + id);
		couplings[1].load(tmp);

	}

	/**
	 * lists all the animals in a Transporter
	 */
	public void list() {

		System.out.print(listAnimalsInTransporter());
		System.out.print(listBigGames());
		
		if (couplings[2].trailer != null)
			System.out.println(listAnimalsInTrailers());

	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transporter [id=" + id + "]";
	}

	/**
	 * Helper method for list print
	 * 
	 * @return a String containing all the animals in trailers.
	 */
	public String listAnimalsInTrailers() {
		StringBuilder builder = new StringBuilder();

		if (this.couplings[2].trailer == null) 
			return builder.toString();
		
		if (couplings[2].trailer.sections[0].animal != null)
			builder.append(couplings[2].trailer.toString() + ": "
					+ couplings[2].trailer.sections[0].animal + "\n");
		if (couplings[2].trailer.sections[1].animal != null)
			builder.append(couplings[2].trailer.toString() + ": "
					+ couplings[2].trailer.sections[1].animal + "\n");
		if (couplings[2].trailer.sections[2].animal != null)
			builder.append(couplings[2].trailer.toString() + ": "
					+ couplings[2].trailer.sections[2].animal + "\n");
		if (couplings[2].trailer.sections[3].animal != null)
			builder.append(couplings[2].trailer.toString() + ": "
					+ couplings[2].trailer.sections[3].animal + "\n");
		if (couplings[2].trailer.sections[4].animal != null)
			builder.append(couplings[2].trailer.toString() + ": "
					+ couplings[2].trailer.sections[4].animal + "\n");
		if (couplings[2].trailer.sections[5].animal != null)
			builder.append(couplings[2].trailer.toString() + ": "
					+ couplings[2].trailer.sections[5].animal + "\n");

		return builder.toString();
	}

	/**
	 * Helper method for list print
	 * 
	 * @return a String with all the animals in the current transporter.
	 */
	public String listAnimalsInTransporter() {

		StringBuilder builder = new StringBuilder();

		if (sections[0].animal != null)
			builder.append(this.toString() + ": " + sections[0].animal + "\n");

		if (sections[1].animal != null)
			builder.append(this.toString() + ": " + sections[1].animal + "\n");
		if (sections[2].animal != null)
			builder.append(this.toString() + ": " + sections[2].animal + "\n");
		if (sections[3].animal != null)
			builder.append(this.toString() + ": " + sections[3].animal + "\n");
		if (sections[4].animal != null)
			builder.append(this.toString() + ": " + sections[4].animal + "\n");
		if (sections[5].animal != null)
			builder.append(this.toString() + ": " + sections[5].animal + "\n");

		return builder.toString();
	}

	/**
	 * Helper method for list print
	 * 
	 * @return a String containing all the BigGames
	 */
	public String listBigGames() {
		StringBuilder builder = new StringBuilder();

		if (couplings[0].bigGame != null)
			builder.append(this.toString() + ": " + couplings[0].bigGame + "\n");
		if (couplings[1].bigGame != null)
			builder.append(this.toString() + ": " + couplings[1].bigGame + "\n");

		return builder.toString();
	}

	/**
	 * load an animal to a specific section
	 * 
	 * @param a
	 * @param n
	 * @return boolean
	 */
	public boolean load(Loadable loadable, Integer section) {

		return loadable.loadOnto(this, section);
	}

	/**
	 * Unloads an Animal in this Transporter or trailer and returns a reference
	 * to it
	 * 
	 * @param s
	 * @return Animal
	 */

	// 0 <= s <= 5
	public Animal unload(int s) {
		return sections[s].unload();

	}

	/**
	 * Unloads the whole transporter
	 * 
	 * @return the unloaded Transporter
	 */
	// The number of sections is always 6 and not variable
	public Transporter unload() {

		sections[0].unload();
		sections[1].unload();
		sections[2].unload();
		sections[3].unload();
		sections[4].unload();
		sections[5].unload();

		return this;
	}

}
