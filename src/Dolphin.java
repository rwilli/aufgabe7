
public class Dolphin extends MarineLife {

	
	public Dolphin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean loadTo(Section s){
		return s.load(this);
	}

	
}
