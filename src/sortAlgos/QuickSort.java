package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

/**
 * This class is QuickSort in order to sort
 * 
 * @author Hong, Kim and Sung
 * @version Mar 3, 2021
 *
 */
public class QuickSort implements SortAlgorithm {

	/**
	 * sort method calls quicksort() method.
	 * @param shapes Shape[]
	 * @param comparator Comparator type comparator
	 */
	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator)  {
		quickSort(shapes, comparator, 0, shapes.length - 1);
	}
	
	/**
	 * 
	 * @param shapes Shape[]
	 * @param comparator Comparator type comparator
	 * @param start integer
	 * @param end integer
	 */
	public void quickSort(Shape[] shapes, Comparator<Shape> comparator, int start, int end) {
		// if start is less than end, call quicksort() recursively.
		if (start < end) {
			int pivotIndex = partition(shapes, comparator, start, end);
			quickSort(shapes, comparator, start, pivotIndex - 1);
			quickSort(shapes, comparator, pivotIndex + 1, end);
		}
	}

	/**
	 * the array is divided by partition method and proceed with partition.
	 * @param shapes Shape[]
	 * @param comparator Comparator type comparator
	 * @param start integer
	 * @param end integer
	 * @return i partition
	 */
	private int partition(Shape[] shapes, Comparator<Shape> comparator, int start, int end) {
		// allocate number into pivot which is Shape type
		Shape pivot = shapes[end];
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			// define boolean value. when input arguments is h, comparator value is null. is not 'h', comparator value is not null.
			boolean isComparator = comparator != null && comparator.compare(shapes[j], pivot) > 0;
			boolean isComparable = comparator == null && (shapes[j]).compareTo(pivot) > 0;
			if (isComparator || isComparable) {
				// change the position.
				Shape tmp =  shapes[i];
				shapes[i] = shapes[j];
				shapes[j] = tmp;
				i++;
			}
		}
		shapes[end] = shapes[i];
		shapes[i] = pivot;
		return i;
	}
}
