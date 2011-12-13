
public class Seal extends Animal {

	public Seal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean loadTo(Section s){
		return s.load(this);
	}
}
