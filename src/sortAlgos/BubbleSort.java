package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

public class BubbleSort implements SortAlgorithm {

	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator) {

		for (int i = 0; i < shapes.length; i++) {
			for (int j = 0; j < shapes.length - 1 - i; j++) {
				Shape curr = shapes[j];
				Shape next = shapes[j + 1];
				Shape temp;

				if (comparator.compare(curr, next) == -1 && comparator != null
						|| curr.compareTo(next) == -1 && comparator == null) {
					temp = next;
					shapes[j + 1] = curr;
					shapes[j] = temp;
				}

			}
		}

	}

}
