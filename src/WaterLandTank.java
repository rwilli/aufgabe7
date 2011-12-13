
public class WaterLandTank extends Section {


	public boolean load(Mamba m){
		return false;

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
		this.animal = s;
		return true;
	}
	public boolean load(Dolphin d){
		
		return false;
	}
	public boolean load(Swordfish s){
		
		return false;
	}



}
