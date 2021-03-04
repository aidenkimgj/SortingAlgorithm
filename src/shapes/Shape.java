package shapes;

/**
 * Abstract data type for Shape
 * 
 * @author Hong, Kim and Sung
 * @version March 4, 2021
 *
 */

public abstract class Shape implements Comparable<Shape> {
	/**
	 * Attribute
	 */
	protected double height;
	/**
	 * Constructor
	 * @param height - double type height
	 */
	public Shape(double height) {
		this.height = height;
	}
	/**
	 * Get height
	 * @return height - double type height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * abstract volume calculator method
	 * @return volume - double type volume
	 */
	public abstract double calcVolume();
	
	/**
	 * abstract base area calculator method
	 * @return baseArea - double type baseArea
	 */
	public abstract double calcBaseArea();
/**
 * Compare height
 * @param o - Shape type object
 * @return 1,-1,0 - int type numbers
 */
	@Override
	public int compareTo(Shape o) {
		if (this.height > o.height) {
			return 1;
		} else if (this.height < o.height) {
			return -1;
		} else {
			// this.height == o.height
			return 0;
		}		
	}	
}
