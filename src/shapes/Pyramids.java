package shapes;

/**
 * 
 * Pyramids class which has two methods.
 * @author Hong, Kim and Sung
 * @version Mar 3, 2021
 *
 */
public class Pyramids extends Shape {
	private double length;

	/**
	 *  Pyramids constructor 
	 * @param height double
	 * @param length double
	 */
	public Pyramids(double height, double length) {
		super(height);
		this.length = length;
	}

	/**
	 * calcVolume method - calculate pyramids volume.
	 * @return volume double
	 */
	@Override
	public double calcVolume() {
		return (calcBaseArea() * this.height) / 3;
	}

	/**
	 * calcVolume method - calculate pyramids volume.
	 * @return baseArea double
	 */
	@Override
	public double calcBaseArea() {
		return Math.pow(this.length, 2);
	}

}
