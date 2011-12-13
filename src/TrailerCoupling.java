
public class TrailerCoupling {
	
	final int id;
	BigGame bigGame;
	Trailer trailer;
	
	
	TrailerCoupling(int id){
		this.id = id;
		bigGame = null;
		trailer = null;
	}
	
	public boolean load(Trailer t){
		if(this.bigGame != null || this.trailer != null)
			return false;
		else{
		this.trailer = t;
		return true;
		}
	}
	public boolean load(BigGame bigGame){
		if(this.bigGame == null && this.trailer == null ){
			this.bigGame = bigGame;
			return true;
		}
		else
			return false;
	}

}
