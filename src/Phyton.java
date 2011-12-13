
public class Phyton extends Reptile {

	public Phyton(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean loadTo(Section s){
		return s.load(this);
	}
}
