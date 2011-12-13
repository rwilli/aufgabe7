import java.util.Iterator;
import java.util.LinkedList;



public class Transporter {
	final private LinkedList<Section> lstSections;
	final private LinkedList<TrailerCoupling> lstTraileCouplings;
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

	}

	public void list() {
		
		Iterator<Section> iterator = lstSections.iterator();
		System.out.println("Transporter: " + id);
		while(iterator.hasNext()){
			
			if(iterator.next().animal != null )
				System.out.println("\t"+ iterator.next().animal.name);
			
		}
		
	}
	
	public boolean load(Trailer t) {
		return true;
	}
	
}
