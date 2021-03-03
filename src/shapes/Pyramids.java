package shapes;

public class Pyramids extends Shape {
	private double length;

	public Pyramids(double height, double length) {
		super(height);
		this.length = length;
	}

	@Override
	public double calcVolume() {
		return (calcBaseArea() * this.height) / 3;
	}

	@Override
	public double calcBaseArea() {
		return Math.pow(length, 2);
	}

}
