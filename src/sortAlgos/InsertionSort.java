package sortAlgos;

import java.util.Comparator;

import comparators.CompareBaseArea;
import comparators.CompareVolume;
import shapes.Shape;

public class InsertionSort implements SortAlgorithm {
	@Override
	public void sort(Shape[] shapes, Comparator<Shape> comparator)  {
		
		for (int i = 1; i < shapes.length; i++) {
			
			int j = i - 1;
			
			Shape key = shapes[i];
			
			if (comparator instanceof CompareBaseArea || comparator instanceof CompareVolume) {
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
