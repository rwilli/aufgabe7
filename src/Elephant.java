
public class Elephant extends BigGame {

	public Elephant(String name) {
		super(name);
	}

	@Override
	public boolean loadTo(Section s) {
		// cannot be loaded, always returns false
		return false;
	}

}
