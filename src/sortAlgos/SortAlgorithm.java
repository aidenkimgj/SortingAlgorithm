package sortAlgos;

import java.util.Comparator;

import shapes.Shape;

public interface SortAlgorithm {
		
	public void sort(Shape[] shapes, Comparator<Shape> comparator);

}
