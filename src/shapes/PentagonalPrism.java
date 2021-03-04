package shapes;

/**
 * PentagonalPrism Object which has two methods
 * @author Hong, Kim and Sung
 * @version Mar 3, 2021
 *
 */
public class PentagonalPrism extends Prism {
	
	/**
	 * PentagonalPrism constructor 
	 * @param height - double type height
	 * @param length - double type length
	 */
	public PentagonalPrism(double height, double length) {
		super(height, length);
		
	}

	/**
	 * calcVolume method - calculate pentagonalPrism volume.
	 * @return volume double
	 */
	@Override
	public double calcVolume() {		
		return calcBaseArea() * this.height;
	}


	/**
	 * calcVolume method - calculate pentagonalPrism base area.
	 * @return baseArea double
	 */
	@Override
	public double calcBaseArea() {			
		return 5 * Math.pow(this.length, 2) * Math.tan(Math.toRadians(54)) / 4;
	}

}
