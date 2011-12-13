
public class Swordfish extends Animal {

	public Swordfish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean loadTo(Section s){
		return s.load(this);
	}
}
