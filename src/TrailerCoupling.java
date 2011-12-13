
public class TrailerCoupling {
	
	final int id;
	BigGame bigGame;
	Trailer trailer;
	
	
	TrailerCoupling(int id){
		this.id = id;
	}
	
	public boolean load(Trailer t){
		if(bigGame != null || trailer != null)
			return false;
		else{
		this.trailer = t;
		return true;
		}
	}
	public boolean load(BigGame bigGame){
		if(bigGame != null || trailer != null )
			return false;
		else{
		this.bigGame = bigGame;
		return true;
		}
	}

}
