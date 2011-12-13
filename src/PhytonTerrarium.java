
public class PhytonTerrarium extends Section{

	
	
	public boolean load(Mamba m){
		this.animal = m;
		return true;
	}
	public boolean load(Phyton p){
		this.animal = p;
		return true;
	}
	public boolean load(DwarfTortoise d){
		
		return false;
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
