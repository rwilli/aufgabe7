
public class MambaTerrarium extends Section{
	
	
	public boolean load(Mamba m){
		this.animal = m;
		return true;
	}
	public boolean load(Phyton p){
	
		return false;
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
