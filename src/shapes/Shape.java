package shapes;

public abstract class Shape implements Comparable<Shape> {
	
	protected double height;
	
	public Shape(double height) {
		this.height = height;
	}
		
	public double getHeight() {
		return height;
	}

	public abstract double calcVolume();
	
	public abstract double calcBaseArea();

	@Override
	public int compareTo(Shape o) {
		if (this.height > o.height) {
			return 1;
		} else if (this.height < o.height) {
			return -1;
		} else {
			// this.height == o.height
			return 0;
		}		
	}	
}
