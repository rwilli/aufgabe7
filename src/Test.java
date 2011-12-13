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
		//Transporter trans1 = new Transporter(4);
		
		Animal dolphine = new Dolphin("Peter");
		Section waterLandTank = new WaterLandTank();
		Section waterTank = new WaterTank();
		
		
		System.out.println(dolphine.loadTo(waterLandTank) );
		System.out.println(dolphine.loadTo(waterTank) );
	}

}
