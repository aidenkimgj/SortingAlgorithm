package sortAlgos;

import java.util.Comparator;
import shapes.Shape;

/**
 * This class implements an array by repeatedly finding the minimum
 * index from the unsorted data and putting it.
 * 
 * @author Hong, Kim, and Sung.
 * @version 04 Mar, 2021
 */
public class SeletionSort implements SortAlgorithm {
	
	/**
	 * This function is to implement a selection sort.
	 */
	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator)  {		
		int length = shapes.length;
		// One by one move boundary of unsorted array.
		for (int i = 0; i < length - 1; i++) {
			// Find the minimum in the shapes
			int currMinIndex = i;						
			for (int j = i + 1; j < length; j++) {								
				if (comparator != null && comparator.compare(shapes[j], shapes[currMinIndex]) == 1 
						|| comparator == null && shapes[j].compareTo(shapes[currMinIndex]) == 1) {
					currMinIndex = j;
				}
			}
			// Swap the found minimum index with the first index.
			Comparable<Shape> minNum = shapes[currMinIndex];
			shapes[currMinIndex] = shapes[i];
			shapes[i] = (Shape) minNum;
		}
	}
}
