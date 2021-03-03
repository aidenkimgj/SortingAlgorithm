package shapes;

public class TriangularPrism extends Prism {

	public TriangularPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	@Override
	public double calcBaseArea() {
		return (Math.sqrt(3) * Math.pow(this.length, 2)) / 4;
	}

}
