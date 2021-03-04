package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

/**
 * OurSort class is defined in shell sorting.
 * @author Hong, Kim and Sung
 * @version Mar 3, 2021
 *
 */
public class OurSort implements SortAlgorithm {

	/**
	 * sort method calls insertionSortWithGap() method.
	 * @param shpes Shape[]
	 * @param comparator Comparator<Shape>
	 */
	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator)  {
		
		// if there is no array defined, just return to finish.
		if (shapes == null || shapes.length == 0)
			return;

		// get max gap number with shape's length.
		int maxGapNum = getGapMaxNumber(shapes.length);
		while (maxGapNum >= 1) {
			for (int i = 0; i < maxGapNum; i++) {
				gapSort(shapes, comparator, i, maxGapNum);
			}
			// decrease the gap
			maxGapNum = (maxGapNum - 1) / 3; 
		}
		
	}
	
	/**
	 * shell sorting method with gap.
	 * @param shapes Shape[]
	 * @param comparator Comparator<Shape>
	 * @param startIndex integer
	 * @param gap integer
	 */
	private void gapSort(Shape[] shapes, Comparator<Shape> comparator, int startIndex, int gap) {
		int a = startIndex;
		while (a < shapes.length) {
			Shape current =  shapes[a];
			int b = a - gap;
			if (comparator != null) {
				while (b >= 0 && comparator.compare(shapes[b], current) <= 0) {
					shapes[b + gap] = shapes[b];
					b = b - gap;
				}
			} else {
				while (b >= 0 && (shapes[b]).compareTo(current) <= 0) {
					shapes[b + gap] = shapes[b];
					b= b - gap;
				}
			}
			shapes[b + gap] = current;
			a = a + gap;
		}
	}

	/**
	 * calculate gap number.
	 * @param size
	 * @return max gap.
	 */
	private int getGapMaxNumber(int size) {
		int value = 1;
		while (value < size / 3) {
			value = 3 * value + 1;
		}
		return value;
	}
	
	

}

