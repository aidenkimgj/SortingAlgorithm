package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

/**
 * Merge Sort Algorithm
 * 
 * @author Hong, Kim and Sung
 * @version March 4, 2021
 * 
 */
public class MergeSort implements SortAlgorithm {
	/**
	 * Attribute
	 */
	private Comparator<Shape> comparator;

	/**
	 * This method just acts as a bridge that operates real merge sort.
	 * 
	 * @param shapes     - Shape type array
	 * @param comparator - comparator
	 * 
	 */
	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator) {
		this.comparator = comparator;
		mergeSort(shapes, 0, shapes.length - 1);
	}

	/**
	 * This method will be operated that breaks the array into minimum units for an
	 * array.
	 * 
	 * @param shapes - Shape type array
	 * @param left   - int type start index
	 * @param right  - int type end index
	 */
	public void mergeSort(Shape[] shapes, int left, int right) {
		if (left < right) {

			// mid is the point where the array is divided into two sub arrays
			int mid = (left + right) / 2;

			// recursive call to each sub arrays
			mergeSort(shapes, left, mid);
			mergeSort(shapes, mid + 1, right);

			// Merge the sorted sub arrays
			merge(shapes, left, mid, right);
		}

	}

	/**
	 * 
	 * @param temp
	 * @param start
	 * @param mid
	 * @param end
	 */
	public void merge(Shape[] temp, int start, int mid, int end) {
		int leftSize = mid - start + 1;
		int rightSize = end - mid;

		Shape[] left = new Shape[leftSize];
		Shape[] right = new Shape[rightSize];

		// fill the left and right array
		for (int i = 0; i < leftSize; i++)
			left[i] = temp[start + i];
		for (int j = 0; j < rightSize; j++)
			right[j] = temp[mid + 1 + j];

		// Maintain current index of sub-arrays and main array
		int i, j, k;
		i = 0;
		j = 0;
		k = start;

		// Until we reach either end of either left or right, pick larger among
		// elements left and right and place them in the correct position at temp array

		while (i < leftSize && j < rightSize) {
			if (this.comparator != null) {
				if (this.comparator.compare(left[i], right[j]) == 1
						|| this.comparator.compare(left[i], right[j]) == 0) {
					temp[k] = left[i];
					i++;
				} else {
					temp[k] = right[j];
					j++;
				}
			} else if (left[i].compareTo(right[j]) == 1 || left[i].compareTo(right[j]) == 0) {
				temp[k] = left[i];
				i++;
			} else {
				temp[k] = right[j];
				j++;
			}
			k++;
		}

		// When we run out of elements in either left or right,
		// pick up the remaining elements and put in temp array
		while (i < leftSize) {
			temp[k] = left[i];
			i++;
			k++;
		}

		while (j < rightSize) {
			temp[k] = right[j];
			j++;
			k++;
		}

	}

}
