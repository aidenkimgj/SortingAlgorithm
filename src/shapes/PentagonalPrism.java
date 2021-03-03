package shapes;

public class PentagonalPrism extends Prism {

	public PentagonalPrism(double height, double length) {
		super(height, length);
		
	}

	@Override
	public double calcVolume() {		
		return calcBaseArea() * this.height;
	}

	@Override
	public double calcBaseArea() {			
		return (5 * Math.pow(this.length, 2) * Math.tan(Math.toRadians(54))) / 4;
	}

}
