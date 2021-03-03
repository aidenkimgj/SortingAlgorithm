package analysis;

import java.util.Comparator;

import comparators.CompareBaseArea;
import comparators.CompareVolume;
import shapes.Shape;
import sortAlgos.SortAlgorithm;

public class Analyser {

	private Shape[] shapes;
	private Comparator<Shape> comparator;
	private SortAlgorithm sortAlgorithm;

	public Analyser() {

	}

	public Analyser(Shape[] shapes, Comparator<Shape> comparator, SortAlgorithm sortAlgorithm) {
		this.shapes = shapes;
		this.comparator = comparator;
		this.sortAlgorithm = sortAlgorithm;
	}

	public void analyze() {
		long start, stop, result;
		double value = 0;
		
		start = System.currentTimeMillis();
		
		this.sortAlgorithm.sort(this.shapes, this.comparator);
		
		stop = System.currentTimeMillis();
		
		result = stop - start;
		
		int i = 0;
		
		for(Shape shape : this.shapes) {
			if(this.comparator instanceof CompareBaseArea) {
				value = shape.calcBaseArea();
			} else if (this.comparator instanceof CompareVolume) {
				value = shape.calcVolume();
			} else {
				value = shape.getHeight();
			}	
			
			if (i == 0) {
				System.out.println("The first index " + value);
			} else if (i == shapes.length - 1) {
				System.out.println("The last index " + value);
			} else if ((i + 1) % 1000 == 0) {
				System.out.println("The " + (i + 1) + " index value " + value);
			}
			i++;
		}
		
		System.out.println("It took " + result + "ms to sorted.");
	}

}
