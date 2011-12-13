
public class Dolphin extends MarineLife {

	
	public Dolphin(String name) {
		super(name);
	}

	public boolean loadTo(Section s){
		return s.load(this);
	}

	
}
