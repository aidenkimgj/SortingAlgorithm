package comparators;

import java.util.Comparator;
import shapes.Shape;

/**
 * This class compares the base area of each shape.
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class CompareBaseArea implements Comparator<Shape> {
	
	/**
	 * This function is to compare two objects.
	 * @param o1 - Shape type object
	 * @param o2 - Shape type object
	 * @return 1,-1,0 - int type numbers
	 */
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
