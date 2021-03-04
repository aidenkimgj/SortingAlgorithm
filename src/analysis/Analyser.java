package analysis;

import java.util.Comparator;

import comparators.CompareBaseArea;
import comparators.CompareVolume;
import shapes.Shape;
import sortAlgos.SortAlgorithm;

/**
 * This class calculates the performance of several sort methods.
 * @author Hong, Kim and Sung
 * @version Mar 3, 2021
 *
 */
public class Analyser {

	/**
	 * define fields.
	 */
	private Shape[] shapes;
	private Comparator<Shape> comparator;
	private SortAlgorithm sortAlgorithm;

	/**
	 * default constructor.
	 */
	public Analyser() {}

	/**
	 * constructor with three arguments.
	 * @param shapes Shape[]
	 * @param comparator - Comparator type comparator
	 * @param sortAlgorithm SortAlgorithm
	 */
	public Analyser(Shape[] shapes, Comparator<Shape> comparator, SortAlgorithm sortAlgorithm) {
		this.shapes = shapes;
		this.comparator = comparator;
		this.sortAlgorithm = sortAlgorithm;
	}

	/**
	 * analyze method to calculate and compare time.
	 */
	public void analyze() {
		long start, stop, result;
		double value = 0;
		// define start time.
		start = System.currentTimeMillis();
		// call sort method.
		this.sortAlgorithm.sort(this.shapes, this.comparator);
		// define stop time.
		stop = System.currentTimeMillis();
		
		// implements duration of sorting time.
		result = stop - start;
		
		int i = 0;
		// for loop, until shapes array length.
		for(Shape shape : this.shapes) {
			// if comparator's instance type is same as ComparBaseArea.
			if(this.comparator instanceof CompareBaseArea) {
				value = shape.calcBaseArea();
			// if comparator's instance type is same as CompareVolume.
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
