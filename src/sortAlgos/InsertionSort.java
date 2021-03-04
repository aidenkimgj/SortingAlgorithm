package sortAlgos;

import java.util.Comparator;
import comparators.CompareBaseArea;
import comparators.CompareVolume;
import shapes.Shape;

/**
 * This class implements of Insertion sort.
 * 
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class InsertionSort implements SortAlgorithm {
	
	/**
	 * This function is to sort array using insertion.
	 * @param shapes     - Shape type array
	 * @param comparator - comparator
	 */
	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator)  {
		
		int length = shapes.length;
		
		for (int i = 1; i < length; i++) {						
			int j = i - 1;			
			Shape key = shapes[i];
			
			if (comparator instanceof CompareBaseArea || comparator instanceof CompareVolume) {
				// Move index of array, that are less than key.
				while (j >= 0 && comparator.compare(shapes[j], key) < 0)  {
					shapes[j + 1] = shapes[j];
					j = j - 1;
				}				
			} else {
				while (j >= 0 && shapes[j].compareTo(key) < 0)  {
					shapes[j + 1] = shapes[j];
					j = j - 1;
				}
			}
			shapes[j + 1] = key;			
		}
	}

}
