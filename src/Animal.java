
public abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract boolean loadTo(Section s);

}
