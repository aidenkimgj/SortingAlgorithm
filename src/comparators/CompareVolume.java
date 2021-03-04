package comparators;

import java.util.Comparator;
import shapes.Shape;

/**
 * This class compares the volume of each shape.
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class CompareVolume implements Comparator<Shape> {
	
	/**
	 * This function is to compare two objects.
	 * @param o1 - Shape type object
	 * @param o2 - Shape type object
	 * @return 1,-1,0 - int type numbers
	 */
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
