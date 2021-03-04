package shapes;

/**
 * 
 * Prism abstract class which has only one constructor.
 * @author Hong, Kim and Sung
 * @version Mar 3, 2021
 *
 */
public abstract class Prism extends Shape {
	
	protected double length;
	
	/**
	 * define length and height.
	 * @param height double
	 * @param length double
	 */
	public Prism(double height, double length) {
		super(height);
		this.length = length;
	}

}
