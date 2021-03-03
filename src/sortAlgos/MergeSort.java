package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

public class MergeSort implements SortAlgorithm {

	private Comparator<Shape> comparator;

	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator) {
		this.comparator = comparator;
		mergeSort(shapes);
	}

	public void mergeSort(Shape[] shapes) {

		int arrLength = shapes.length;

		if (arrLength > 1) {

			Shape[] firstHalf = new Shape[arrLength / 2];
			System.arraycopy(shapes, 0, firstHalf, 0, arrLength / 2);
			mergeSort(firstHalf);

			int secondHalfLength = arrLength - (arrLength / 2);
			Shape[] secondHalf = new Shape[secondHalfLength];
			System.arraycopy(shapes, arrLength / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);

			merge(firstHalf, secondHalf, shapes);
		}
	}

	public void merge(Shape[] firstHalf, Shape[] secondHalf, Shape[] temp) {
		int current1 = 0; // Current index in firstHalf
		int current2 = 0; // Current index in secondHalf
		int current3 = 0; // Current index in temp

		while (current1 < firstHalf.length && current2 < secondHalf.length) {
			if (this.comparator.compare(firstHalf[current1], secondHalf[current2]) == -1 ) {
				temp[current3++] = secondHalf[current1++];
			} else {
				temp[current3++] = firstHalf[current2++];
			}
		}

		while (current1 < firstHalf.length)
			temp[current3++] = firstHalf[current1++];

		while (current2 < secondHalf.length)
			temp[current3++] = secondHalf[current2++];
	}
	
	

}
