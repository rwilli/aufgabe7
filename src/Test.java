

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
		
		
		Animal dolphin = new Dolphin("Dolphin1");
		Animal seal = new Seal("Seal1");
		Animal dwarf = new DwarfTortoise("Dwarf1");
		Animal giant = new GiantTortoise("Giant1");
		Animal mamba = new Mamba("Mamba1");
		Animal python = new Python("Python1");
		Animal swordfish = new Swordfish("Swordfisch1");
		
		
		/*
		 * Create one transporter 
		 * Our transporter and trailers have fix numbers of sections
		 * Section1 is a WaterTank
		 * Section2 is a WaterLandTank
		 * Section3 is a PythonTerrarium
		 * Section4 is a MambaTerrarium
		 * Section5 is a GiantTortoiseTerrarium
		 * Section6 is a DwarfTortoiseTerrarium
		 * 
		 * Also on the first and second coupling are BigGame animales on every transporter
		 * The 3rd coupling is free.
		 */
		Transporter trans1 = new Transporter(1);
		
		// This returns true, because a dolphin can be added to a WaterTank
		System.out.println(" Add Dolphin: " + trans1.load(dolphin, 0) );
		
		// This returns false, because a gianttortoise can't be added to a WaterTank
		System.out.println(" Add Giant: " + trans1.load(giant, 0) );
		
		// This returns true, because a seal can be added to a WaterLandTank
		System.out.println(" Add Seal: " + trans1.load(seal, 1) );
		
		// Print all Animals contained in trans1 or his trailers or on his couplings
		trans1.list();
		
		
		Trailer trailer1 = new Trailer(2);
		
		// add a Trailer on the free coupling on trans1
		System.out.println("Load Trailer to Trans1: " + trans1.load(trailer1, 2) );
		
		// Print all Animals contained in trans1 or his trailers or on his couplings
		
		System.out.println("------- After we added the first Trailer---------");
		trans1.list();
		
		
		System.out.println("------- Add more to the Trailer---------");
		
		System.out.println(" Add Mamba: " +trailer1.load(mamba, 3) );
		System.out.println(" Add Python: " +trailer1.load(python, 2) );
		System.out.println(" Add Dwarf: " +trailer1.load(dwarf, 5) );
		System.out.println(" Add Swordfish: " +trailer1.load(swordfish, 5) );

		
		System.out.println("------- After we added more animals to the first Trailer---------");
		trans1.list();
		
		System.out.println("------- Try to add a two Mambas on trans1 one in MambaTerrarium and one in Python---------");
		Animal tmp = new Mamba("Mamba2");
		System.out.println(" Add Mamba to MambaTerrarium " +trans1.load(tmp, 3) );
		tmp = new Mamba("Mamba3");
		System.out.println(" Add Mamba to PythonTerrarium " +trans1.load(tmp, 2) );
		tmp = new Mamba("Mamba4");
		
		// This Terrarium is already full
		System.out.println(" Try to add another one to PythonTerrarium " );
		trans1.load(tmp, 2);

		trans1.list();

		//unload Section 1  and 2 of the transporter1
		System.out.println( trans1.unload(0) );
		System.out.println( trans1.unload(1) );
		
		System.out.println("------- After we unloaded the first and second section of the transporter---------");
		trans1.list();
		
		System.out.println("------- After we unloaded the whole transporter trans1---------");
		trans1.unload();
		trans1.list();
		
		System.out.println("------- After we unloaded the whole transporter trans2---------");
		trailer1.unload();
		trailer1.list();
		
	}

}
