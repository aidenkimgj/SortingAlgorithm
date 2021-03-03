package shapes;

public class Cone extends Shape {

	private double radius;
	
	public Cone(double height, double radius) {
		super(height);	
		this.radius = radius;
	}
		
	@Override
	public double calcVolume() {		
		return (calcBaseArea() * this.height) / 3;
	}

	
	@Override
	public double calcBaseArea() {		
		return Math.PI * Math.pow(radius, 2);
	}	
}
