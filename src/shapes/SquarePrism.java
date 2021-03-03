package shapes;

public class SquarePrism extends Prism {	
	
	public SquarePrism(double height, double length) {
		super(height, length);
	}

	
	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	
	@Override
	public double calcBaseArea() {
		return Math.pow(this.length, 2);
	}

}
