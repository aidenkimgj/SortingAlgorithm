package comparators;

import java.util.Comparator;

import shapes.Shape;

public class CompareVolume implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		
		if (o1.calcVolume() > o2.calcVolume()) {
			return 1;
		} else if (o1.calcVolume() < o2.calcVolume()) {
			return -1;
		} else {
			// o1.calcVolume() == o1.calcVolume()
			return 0;
		}
	}

}
