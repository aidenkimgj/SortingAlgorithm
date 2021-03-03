package shapes;

public class OctagonalPrism extends Prism {

	public OctagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	@Override
	public double calcBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(this.length, 2);
	}

}
