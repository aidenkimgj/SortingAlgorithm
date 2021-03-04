package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

/**
 * Sort Algorithm Interface
 * 
 * @author Hong, Kim and Sung
 * @version March 4, 2021
 * 
 */
public interface SortAlgorithm {
	/**
	 * Operates sort.
	 * 
	 * @param shapes     - Shape type array
	 * @param comparator - comparator
	 * 
	 */
	public void sort(Shape[] shapes, Comparator<Shape> comparator);

}
