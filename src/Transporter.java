	import java.util.LinkedList;


public class Transporter {
	
	private LinkedList<Animal> lstAnimals;
	private LinkedList<Trailer> lstTrailers;
	final private int trailerCouplingQuantity;
	
	public Transporter(int coupling) {
		this.lstAnimals = new LinkedList<Animal>();
		this.lstTrailers = new LinkedList<Trailer>();
		this.trailerCouplingQuantity = coupling;
		
	}

	public void list() {
		System.out.println(lstAnimals);
	}
	
	public boolean load(Trailer t) {
		return true;
	}
	
	public Trailer unload(Trailer t) {
		lstTrailers.remove(t);
		return t;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((lstAnimals == null) ? 0 : lstAnimals.hashCode());
		result = prime * result
				+ ((lstTrailers == null) ? 0 : lstTrailers.hashCode());
		result = prime * result + trailerCouplingQuantity;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Transporter))
			return false;
		Transporter other = (Transporter) obj;
		if (lstAnimals == null) {
			if (other.lstAnimals != null)
				return false;
		} else if (!lstAnimals.equals(other.lstAnimals))
			return false;
		if (lstTrailers == null) {
			if (other.lstTrailers != null)
				return false;
		} else if (!lstTrailers.equals(other.lstTrailers))
			return false;
		if (trailerCouplingQuantity != other.trailerCouplingQuantity)
			return false;
		return true;
	}
	
	
	
}
