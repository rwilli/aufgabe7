
public class DwarfTortoiseTerrarium extends Section {

	
	
	public boolean load(Mamba m){
		return false;

	}
	public boolean load(Phyton p){
		return false;

	}
	public boolean load(DwarfTortoise d){
		
		this.animal = d;
		return true;
	}
	public boolean load(GiantTortoise g){
		
		return false;
	}
	public boolean load(Seal s){
		
		return false;
	}
	public boolean load(Dolphin d){
		
		return false;
	}
	public boolean load(Swordfish s){
		
		return false;
	}


}
