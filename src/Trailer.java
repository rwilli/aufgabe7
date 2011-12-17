/**
 * Class Trailer extends Transporter
 * 
 * @author Gruppe222
 * 
 */
public class Trailer extends Transporter implements Loadable {

	/**
	 * Every Trailer has also his unique ID.
	 * 
	 * @param id
	 *            the ID as Integer
	 */
	// id > 0 and unique
	Trailer(int id) {
		super(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Transporter#toString()
	 */
	@Override
	public String toString() {
		return "Trailer [id=" + id + "]";
	}

	/*
	 * (non-Javadoc)
	 * @see Loadable#loadOnto(Transporter, java.lang.Integer)
	 */
	@Override
	public boolean loadOnto(Transporter t, Integer section) {
		return t.couplings[2].load(this);	
	}
	
	

}
