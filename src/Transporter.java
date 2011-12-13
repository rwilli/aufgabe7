	import java.util.LinkedList;


public class Transporter {
	private LinkedList<Animal> lstAnimals;
	private LinkedList<Trailer> lstTrailers;
	final private int trailerCouplingQuantity;
	
	public Transporter(int coupling) {
		this.lstAnimals = new LinkedList<Animal>();
		this.trailerCouplingQuantity = coupling;
		
	}

	public void list() {
		
	}
	
	public boolean load(Trailer t) {
		return true;
	}
	
}
