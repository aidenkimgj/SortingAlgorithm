package shapes;

/**
 * SquarePrism calculator
 * 
 * @author Hong, Kim and Sung
 * @version March 4, 2021
 *
 */
public class SquarePrism extends Prism {	
	/**
	 * Constructor
	 * 
	 * @param height - double type height
	 * @param length - double type length
	 */
	public SquarePrism(double height, double length) {
		super(height, length);
	}

	/**
	 * Volume calculator
	 * 
	 * @return volume - calcBaseArea() * this.height
	 */
	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	/**
	 * BaseArea calculator
	 * 
	 * @return BaseArea - Math.pow(this.length, 2)
	 */
	@Override
	public double calcBaseArea() {
		return Math.pow(this.length, 2);
	}

}
