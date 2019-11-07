package Main;

import java.util.Random;

import Algorithms.Sorting;

public class Main {

	public static void main(String[] args) {
		Random gen = new Random();
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = gen.nextInt(10);
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("---------");
		
		Sorting.SelectionSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
