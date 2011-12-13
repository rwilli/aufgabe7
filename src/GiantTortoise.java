
public class GiantTortoise extends Animal{

	public GiantTortoise(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean loadTo(Section s){
		return s.load(this);
	}
}
