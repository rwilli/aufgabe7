import java.util.Iterator;
import java.util.LinkedList;

public class Transporter {
	final private LinkedList<Section> lstSections;
	final private LinkedList<TrailerCoupling> lstTrailerCouplings;
	final int id;

	public Transporter(int id) {
		this.id = id;
		this.lstSections = new LinkedList<Section>();
		this.lstSections.add(new WaterTank());
		this.lstSections.add(new WaterLandTank());
		this.lstSections.add(new PythonTerrarium());
		this.lstSections.add(new MambaTerrarium());
		this.lstSections.add(new GiantTortoiseTerrarium());
		this.lstSections.add(new DwarfTortoiseTerrarium());
		// this.lstSections.add(new TrailerCoupling());
		// this.lstSections.add(new DwarfTortoiseTerrarium());
		this.lstTrailerCouplings = new LinkedList<TrailerCoupling>();
		this.lstTrailerCouplings.add(new TrailerCoupling(1));
		this.lstTrailerCouplings.add(new TrailerCoupling(2));
		this.lstTrailerCouplings.add(new TrailerCoupling(3));

		// On the first two couplings are BigGames
		BigGame tmp = new Giraffe("Giraffe at "+ id);
		this.lstTrailerCouplings.get(0).load(tmp);
		tmp = new Elephant("Elephant at "+ id);
		this.lstTrailerCouplings.get(1).load(tmp);

	}

	public void list() {

		Iterator<Section> iter = lstSections.iterator();
		System.out.println(this);
	
		while(iter.hasNext()){
			Section tmp = iter.next();
			if(tmp.animal != null )
				System.out.println("\t"+ tmp.animal.name);
			

		}

		Iterator<TrailerCoupling> iter2 = lstTrailerCouplings.iterator();

		// Add all BigGame Animals also to the list
		while (iter2.hasNext()) {

			TrailerCoupling tmp2 = iter2.next();

			if (tmp2.bigGame != null)
				System.out.println("\t" + tmp2.bigGame.name);



		}

		// now List all other Trailers
		Iterator<TrailerCoupling> iter3 = lstTrailerCouplings.iterator();

		while (iter3.hasNext()) {


			TrailerCoupling tmp3 = iter3.next();

			if (tmp3.trailer != null)
				tmp3.trailer.list();


		}

	}

	@Override
	public String toString() {
		return "Transporter [id=" + id + "]";
	}

	/**
	 * load an animale to a specific section
	 * @param a
	 * @param n
	 * @return boolean
	 */
	public boolean load(Animal a, int n) {

		return a.loadTo(lstSections.get(n));
	}

	/**
	 * load a trailer to a specific coupling
	 * @param t
	 * @param c
	 * @return
	 */
	public boolean load(Trailer t, int c) {
		return lstTrailerCouplings.get(c).load(t);
	}
	
	/**
	 * Unloads an Animal in this Transporter or trailer and returns a reference to it
	 * @param s
	 * @return Animal
	 */
	public Animal unload(int s){
		return lstSections.get(s).unload();
		
	}
	
	public Transporter unload(){
		//????????
		return null;
	}

}
