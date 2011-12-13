/**
 * Class DwarfTortoise extends Reptile
 * 
 * @author Gruppe222
 * 
 */
public class DwarfTortoise extends Reptile {

	public DwarfTortoise(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean loadTo(Section s) {
		return s.load(this);
	}

	@Override
	public Animal unloadFrom(Section s) {
		// TODO Auto-generated method stub
		return null;
	}
}
