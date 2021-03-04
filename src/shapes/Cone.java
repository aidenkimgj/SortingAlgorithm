package shapes;

/**
 * This class calculates Cone shape.
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class Cone extends Shape {
	// Field
	private double radius;
	
	/**
	 * Constructor
	 * @param height
	 * @param radius
	 */
	public Cone(double height, double radius) {
		super(height);	
		this.radius = radius;
	}
	
	/**
	 * This function is to calculate the volume of a cone shape.
	 */
	@Override
	public double calcVolume() {		
		return (calcBaseArea() * this.height) / 3;
	}

	/**
	 * This function is to calculate the base area of a cone shape.
	 */
	@Override
	public double calcBaseArea() {		
		return Math.PI * Math.pow(radius, 2);
	}	
}
