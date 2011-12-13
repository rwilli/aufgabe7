/**
 * Class Trailer extends Transporter
 * 
 * @author Gruppe222
 * 
 */
public class Trailer extends  Transporter {

	/**
	 * Every Trailer has also his unique Id
	 * @param id
	 */
	Trailer(int id ){
		super(id);
	}

	@Override
	public String toString() {
		return "Trailer [id=" + id + "]";
	}
	

}
