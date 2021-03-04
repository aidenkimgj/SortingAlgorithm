package shapes;

/**
 * TriangularPrism calculator
 * 
 * @author Hong, Kim and Sung
 * @version March 4, 2021
 *
 */
public class TriangularPrism extends Prism {
	/**
	 * Constructor
	 * 
	 * @param height - double type height
	 * @param length - double type length
	 */
	public TriangularPrism(double height, double length) {
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
	 * @return BaseArea - (Math.sqrt(3) * Math.pow(this.length, 2)) / 4
	 */
	@Override
	public double calcBaseArea() {
		return (Math.sqrt(3) * Math.pow(this.length, 2)) / 4;
	}

}
