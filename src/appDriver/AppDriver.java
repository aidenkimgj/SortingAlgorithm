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

public class AppDriver {

   public static void main(String[] args) throws IOException {
      long start, stop;
      String fileName = "";
      Comparator comparator = null;
      SortAlgorithm sortAlgo = null;

      for (String arg : args) {
         char option1 = Character.toLowerCase(arg.charAt(1));
         char option2 = Character.toLowerCase(arg.charAt(2));
         System.out.println(option1 + "option1");
         System.out.println(option2 + "option2");
         if (arg.startsWith("-") && arg.length() >= 3) {
            switch (option1) {
            case 'f':
               fileName = arg.substring(2);
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
               default:
                  System.out.println("You put wrong value!!");
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
               default:
                  System.out.println("You put wrong value!!");
                  break;
               }
            default:
               System.out.println("You put wrong value!!");
               break;
            }
         }
      }

      start = System.currentTimeMillis();

      BufferedReader br = new BufferedReader(new FileReader(fileName));

      String[] arr = br.readLine().split(" ");
      br.close();
      int size1 = arr.length;
      int size = (arr.length - 1) / 3;
      System.out.println("size1 ===>"+ size1);
      System.out.println("size ===>"+ size);
      Shape[] shapes = new Shape[size];
      int index = 0;
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
      Analyser analyser = new Analyser(shapes, comparator, sortAlgo);
      analyser.analyze();

   }

}