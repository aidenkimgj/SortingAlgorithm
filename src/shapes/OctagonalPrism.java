package shapes;

/**
 * This class calculates octagonalPrism shape.
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class OctagonalPrism extends Prism {
	
	/**
	 * Constructor
	 * @param height
	 * @param length
	 */
	public OctagonalPrism(double height, double length) {
		super(height, length);
	}
	
	/**
	 * This function is to calculate the volume of a octagonalPrism shape.
	 */
	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}
	
	/**
	 * This function is to calculate the base area of a octagonalPrism shape.
	 */
	@Override
	public double calcBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(this.length, 2) ;
	}
}
