package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

/**
 * Bubble Sort Algorithm
 * 
 * @author Hong, Kim and Sung
 * @version March 4, 2021
 *
 */
public class BubbleSort implements SortAlgorithm {
	
	/**
	 * This method operates bubble sort.
	 * 
	 * @param shapes     - Shape type array
	 * @param comparator - comparator
	 * 
	 */
	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator) {

		for (int i = 0; i < shapes.length; i++) {
			for (int j = 0; j < shapes.length - 1 - i; j++) {
				Shape curr = shapes[j];
				Shape next = shapes[j + 1];
				Shape temp;

				if (comparator == null && curr.compareTo(next) == -1
						|| comparator != null && comparator.compare(curr, next) == -1) {
					temp = next;
					shapes[j + 1] = curr;
					shapes[j] = temp;
				}

			}
		}

	}

}
