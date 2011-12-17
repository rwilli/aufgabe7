/**
 * Class TrailerCoupling
 * 
 * @author Gruppe222
 * 
 */
public class TrailerCoupling {
	
	final int id;
	BigGame bigGame;
	Trailer trailer;
	
	
	/**
	 * Has also a unique Id and a BigGame animal or ah trailer
	 * only one of them can hold a reference
	 * @param id
	 */
	// id > 0 and unique
	TrailerCoupling(int id){
		this.id = id;
		bigGame = null;
		trailer = null;
	}
	
	/**
	 * when loading a trailer, check if biggame or trailer hold a reference already
	 * if not assign the trailer 
	 * @param t
	 * @return boolean
	 */
	// this.bigGame == null && this.trailer == null
	public boolean load(Trailer t){
		if(this.bigGame != null || this.trailer != null)
			return false;
		else{
		this.trailer = t;
		return true;
		}
	}
	/**
	 * when loading a biggame, check if biggame or trailer hold a reference already
	 * if not assign biggame
	 * @param biggame
	 * @return boolean
	 */
	// this.bigGame == null and this.trailer == null
	public boolean load(BigGame bigGame){
		if(this.bigGame == null && this.trailer == null ){
			this.bigGame = bigGame;
			return true;
		}
		else
			return false;
	}

}
