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
		this.lstSections.add(new PhytonTerrarium());
		this.lstSections.add(new MambaTerrarium());
		this.lstSections.add(new GiantTortoiseTerrarium());
		this.lstSections.add(new DwarfTortoiseTerrarium());
		//this.lstSections.add(new TrailerCoupling());
		//this.lstSections.add(new DwarfTortoiseTerrarium());
		this.lstTrailerCouplings = new LinkedList<TrailerCoupling>();
		this.lstTrailerCouplings.add(new TrailerCoupling(1));
		this.lstTrailerCouplings.add(new TrailerCoupling(2));
		this.lstTrailerCouplings.add(new TrailerCoupling(3));
	}

	public void list() {
		
		Iterator<Section> iter = lstSections.iterator();
		System.out.println("Transporter: " + id);
		while(iter.hasNext()){
			
			if(iter.next().animal != null )
				System.out.println("\t"+ iter.next().animal.name);
			
		}
		
		Iterator<TrailerCoupling> iter2 = lstTrailerCouplings.iterator();
		
		
		// Add all BigGame Animals also to the list
		while(iter2.hasNext()){
			
			TrailerCoupling tmp = iter2.next();
			
			if(tmp.bigGame != null)
				System.out.println("\t"+ tmp.bigGame.name);
		}
		
		//now List all other Trailers
		Iterator<TrailerCoupling> iter3 = lstTrailerCouplings.iterator();
		
		while(iter3.hasNext()){
			
			TrailerCoupling tmp = iter3.next();
			
			if(tmp.trailer != null )
				tmp.trailer.list();
		}
		
	}
	
	public boolean load(Animal a, int n){
		
		return a.loadTo(lstSections.get(n));
	}
	public boolean load(Trailer t, int c) {
		return lstTrailerCouplings.get(c).load(t);
	}
	
}
