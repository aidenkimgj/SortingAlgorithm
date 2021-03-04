package appDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

import analysis.Analyser;
import comparators.CompareBaseArea;
import comparators.CompareVolume;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramids;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import sortAlgos.BubbleSort;
import sortAlgos.InsertionSort;
import sortAlgos.MergeSort;
import sortAlgos.OurSort;
import sortAlgos.QuickSort;
import sortAlgos.SeletionSort;
import sortAlgos.SortAlgorithm;

/**
 * Main Application
 * 
 * @author Hong, Kim and Sung
 * @version March 4, 2021
 *
 */
public class AppDriver {
	/**
	 * Main method
	 * 
	 * @param args - args
	 * @throws IOException - IOException
	 */
	public static void main(String[] args) throws IOException {
		// Global variables
		long start, stop;
		String fileName = "";
		Comparator comparator = null;
		SortAlgorithm sortAlgo = null;

		// To get a command that what user wants to sort which type
		for (String arg : args) {
			char option1 = Character.toLowerCase(arg.charAt(1));
			char option2 = Character.toLowerCase(arg.charAt(2));
			// To perform only the instructions that conform to the rules
			if (arg.startsWith("-") && arg.length() >= 3) {
				switch (option1) {
				case 'f':
					fileName = arg.substring(2);
					System.out.println("fileName ===> " + fileName);
					break;
				case 't':
					switch (option2) {
					case 'v':
						comparator = new CompareVolume();
						break;
					case 'h':
						break;
					case 'a':
						comparator = new CompareBaseArea();
						break;
					}
				case 's':
					switch (option2) {
					case 'b':
						sortAlgo = new BubbleSort();
						break;
					case 's':
						sortAlgo = new SeletionSort();
						break;
					case 'i':
						sortAlgo = new InsertionSort();
						break;
					case 'm':
						sortAlgo = new MergeSort();
						break;
					case 'q':
						sortAlgo = new QuickSort();
						break;
					case 'z':
						sortAlgo = new OurSort();
						break;
					}
				}
			}
		}
		// To get Shape type, height and length from file
		BufferedReader br = new BufferedReader(new FileReader(fileName));

		String[] arr = br.readLine().split(" ");
		br.close();

		int size = (arr.length - 1) / 3;

		Shape[] shapes = new Shape[size];
		int index = 0;
		
		// To put Shape object in the Shape array
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case "Cone":
				Cone cone = new Cone(Double.parseDouble(arr[i + 1]), Double.parseDouble(arr[i + 2]));
				shapes[index] = cone;
				index++;
				break;
			case "Cylinder":
				Cylinder cylinder = new Cylinder(Double.parseDouble(arr[i + 1]), Double.parseDouble(arr[i + 2]));
				shapes[index] = cylinder;
				index++;
				break;
			case "OctagonalPrism":
				OctagonalPrism octagonalPrism = new OctagonalPrism(Double.parseDouble(arr[i + 1]),
						Double.parseDouble(arr[i + 2]));
				shapes[index] = octagonalPrism;
				index++;
				break;
			case "PentagonalPrism":
				PentagonalPrism pentagonalPrism = new PentagonalPrism(Double.parseDouble(arr[i + 1]),
						Double.parseDouble(arr[i + 2]));
				shapes[index] = pentagonalPrism;
				index++;
				break;
			case "Pyramid":
				Pyramids pyramids = new Pyramids(Double.parseDouble(arr[i + 1]), Double.parseDouble(arr[i + 2]));
				shapes[index] = pyramids;
				index++;
				break;
			case "SquarePrism":
				SquarePrism squarePrism = new SquarePrism(Double.parseDouble(arr[i + 1]),
						Double.parseDouble(arr[i + 2]));
				shapes[index] = squarePrism;
				index++;
				break;
			case "TriangularPrism":
				TriangularPrism triangularPrism = new TriangularPrism(Double.parseDouble(arr[i + 1]),
						Double.parseDouble(arr[i + 2]));
				shapes[index] = triangularPrism;
				index++;
				break;
			}
		}
		// In order to analyze the sort
		Analyser analyser = new Analyser(shapes, comparator, sortAlgo);
		analyser.analyze();

   }

}