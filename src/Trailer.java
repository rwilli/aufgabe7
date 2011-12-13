/**
 * Class Trailer extends Transporter
 * 
 * @author Gruppe222
 * 
 */
public class Trailer extends Transporter {

	/**
	 * Every Trailer has also his unique ID.
	 * 
	 * @param id
	 *            the ID as Integer
	 */
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

}
