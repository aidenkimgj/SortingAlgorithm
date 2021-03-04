package shapes;

/**
 * This class calculates Cylinder shape.
 * 
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class Cylinder extends Shape {
	// Field
	private double radius;

	/**
	 * Constructor
	 * 
	 * @param height - double type height
	 * @param radius - double type radius
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	/**
	 * This function is to calculate the volume of a cylinder shape.
	 * 
	 * @return volume - calcBaseArea() * this.height
	 */
	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	/**
	 * This function is to calculate the base area of a cylinder shape.
	 * @return BaseArea - Math.PI * Math.pow(this.radius, 2)
	 */
	@Override
	public double calcBaseArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
}
