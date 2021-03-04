package shapes;

/**
 * This class calculates Cylinder shape.
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class Cylinder extends Shape {
	// Field
	private double radius;
	
	/**
	 * Constructor
	 * @param height
	 * @param radius
	 */
	public Cylinder(double height, double radius) {
		super(height);	
		this.radius = radius;
	}

	/**
	 * This function is to calculate the volume of a cylinder shape.
	 */
	@Override
	public double calcVolume() {		
		return calcBaseArea() * this.height;
	}

	/**
	 * This function is to calculate the base area of a cylinder shape.
	 */
	@Override
	public double calcBaseArea() {		
		return Math.PI * Math.pow(this.radius, 2) ;
	}	
}
