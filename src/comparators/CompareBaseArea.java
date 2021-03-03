package comparators;

import java.util.Comparator;

import shapes.Shape;

public class CompareBaseArea implements Comparator<Shape> {
	
	@Override
	public int compare(Shape o1, Shape o2) {
		
		if (o1.calcBaseArea() > o2.calcBaseArea()) {
			return 1;
		} else if (o1.calcBaseArea() < o2.calcBaseArea()) {
			return -1;
		} else {
			// o1.calcBaseArea() == o1.calcBaseArea()
			return 0;
		}
	}

}
