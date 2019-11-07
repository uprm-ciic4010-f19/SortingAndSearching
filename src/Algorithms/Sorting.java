package Algorithms;

public class Sorting {
	
	public static void SelectionSort(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < A.length; j++) {
				if (A[j] < A[minIndex]) {
					minIndex = j;
				}
			}
			// Swap
			swap(A, i, minIndex);
		}
	}
	
	public static void swap(int[] A, int from, int to) {
		int temp = A[from];
		A[from] = A[to];
		A[to] = temp;
	}
	
	public static void InsertionSort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i;
			while (j>0 && A[j-1] > key) {
				A[j] = A[j-1];
				j--;
			}
			A[j] = key;
		}
	}
	
	public static void MergeSort(int[] A) {
//		if (A.length <= 1) {return;}
//		int len1 = A.length/2;
//		int len2 = A.length - len1;
//		int[] first = new int[len1];
//		int[] second = new int[len2];
//		// almacenar la informacion de la derecha y inzquierda
//		MergeSort(first);
//		MergeSort(second);
//		merge(A, first, second);
 	}

}
 