import java.util.LinkedList;

/**
 * 
 */

/**
 * @author rainer
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Animal dolphine = new Dolphin("Dolphin1");
		Animal seal = new Seal("Seal1");
		Animal dwarf = new DwarfTortoise("Dwarfl1");
		Animal giant = new GiantTortoise("Giant1");
		Animal mamba = new Mamba("Mamba");
		Animal phyton = new Phyton("phyton1");
		Animal swordfish = new Swordfish("swordfisch1");
		
		
		/*
		 * Create one transporter 
		 * Our transporter and trailers have fix numbers of sections
		 * Section1 is a WaterTank
		 * Section2 is a WaterLandTank
		 * Section3 is a PhytonTerrarium
		 * Section4 is a MambaTerrarium
		 * Section5 is a GiantTortoiseTerrarium
		 * Section6 is a DwarfTortoiseTerrarium
		 * 
		 */
		Transporter trans1 = new Transporter(1);
		trans1.load(dolphine, 0);
		
		trans1.list();
		
		
		
		
	}

}
