package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

/**
 * OurSort class is defined in shell sorting.
 * 
 * @author Hong, Kim and Sung
 * @version Mar 3, 2021
 *
 */
public class OurSort implements SortAlgorithm {

	/**
	 * sort array using shell sort
	 * 
	 * @param shapes     Shape[]
	 * @param comparator Comparator type comparator
	 * 
	 */
	public void sort(Shape[] shapes, Comparator<Shape> comparator) {
		int arrLength = shapes.length;
		// define gap.
		int gap = arrLength / 2;

		while (gap > 0) {
			for (int i = gap; i < arrLength; i++) {
				Shape temp = shapes[i];
				int j = i;
				// operating when input value is null.
				if (comparator == null) {
					while (j >= gap && shapes[j - gap].compareTo(temp) == -1) {
						shapes[j] = shapes[j - gap];
						j -= gap;
					}
					// operating when input value is not null.
				} else if (comparator != null) {
					while (j >= gap && comparator.compare(shapes[j - gap], temp) == -1) {
						shapes[j] = shapes[j - gap];
						j -= gap;
					}
				}

				shapes[j] = temp;
			}
			gap = gap / 2;
		}
	}

}
