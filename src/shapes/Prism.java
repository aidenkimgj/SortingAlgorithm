package shapes;

public abstract class Prism extends Shape {
	
	protected double length;
	
	public Prism(double height, double length) {
		super(height);
		this.length = length;
	}

//	@Override
//	public double calcVolume() {
//	}

//	@Override abstract
//	public abstract double calcBaseArea();
	
}
