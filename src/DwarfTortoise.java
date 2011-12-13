
public class DwarfTortoise extends Animal {

	public DwarfTortoise(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public boolean loadTo(Section s){
		return s.load(this);
	}
}
