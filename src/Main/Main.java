package Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import Algorithms.Sorting;

public class Main {
	
	private static class DecreasingComparator implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			return b-a;
		}
	}

	public static void main(String[] args) {
		
		Random gen = new Random();
		Integer[] intArray = new Integer[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = gen.nextInt(10);
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("---------");
		
		//Arrays.sort(intArray, new DecreasingComparator()); // Named inner class
		
//		Arrays.sort(intArray, new Comparator<Integer>() {
//			public int compare(Integer a, Integer b) {
//				return b-a;
//			}
//		}); // Anonymous inner class
		
		Arrays.sort(intArray, (a,b) -> a-b); // Named inner class		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		//Binary Search Example
		//int pos = Sorting.internalBinarySearch(intArray, 0, 9, intArray[5]);
		//System.out.println("Position: " + pos);
		
		//Sort arrays of String's
//		String[] words = new String[5];
//		words[0]="Yellow";
//		words[1]="Zebra";
//		words[2]="After";
//		words[3]="Blue";
//		words[4]="Candy";
//		
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(words[i]);
//		}
//		
//		System.out.println("---------");
//		
//		Arrays.sort(words);
//		
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(words[i]);
//		}
	}
}
