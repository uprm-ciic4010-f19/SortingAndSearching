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
		if (A.length <= 1) {return;}
		int len1 = A.length/2;
		int len2 = A.length - len1;
		int[] left = new int[len1];
		int[] right = new int[len2];
		// almacenar la informacion de la derecha y inzquierda
		for (int i=0; i<len1; i++) {
			left[i] = A[i];
		}
		for (int i=0; i<len2; i++) {
			right[i] = A[len1+i];
		}
		MergeSort(left);
		MergeSort(right);
		merge(A, left, right);
	}

	public static void merge(int [] merged, int[] left, int[] right) {

		int iLeft=0;
		int iRight = 0;
		int iMerged = 0;

		while (iLeft < left.length && iRight < right.length) {

			if (left[iLeft] < right[iRight]) {
				merged[iMerged] = left[iLeft];
				iMerged++;
				iLeft++;
			}
			else {
				merged[iMerged] = right[iRight];
				iMerged++;
				iRight++;
			}
		}
		while (iLeft < left.length) {
			merged[iMerged] = left[iLeft];
			iMerged++;
			iLeft++;
		}
		
		while (iRight < right.length) {
			merged[iMerged] = right[iRight];
			iMerged++;
			iRight++;
		}
	}

	public static void QuickSort(int[] a) {
		internalQuickSort(a, 0, a.length-1);
	}

	public static void internalQuickSort(int[] a, int from, int to) {
		if (from >= to) return; 
		int p = partition(a, from, to);
		internalQuickSort(a, from, p);
		internalQuickSort(a, p + 1, to); 
	}

	private static int partition(int[] a, int from, int to)
	{
		int pivot = a[from];
		int i = from - 1;
		int j = to + 1;
		while (i < j)
		{
			i++; while (a[i] < pivot) { i++; }
			j--; while (a[j] > pivot) { j--; }
			if (i < j) { 
				swap(a,i,j);
			}
		}
		return j;
	}

	public static int BinarySearch(int[] a, int value) {

		return internalBinarySearch(a, 0, a.length-1, value);

	}


	public static int internalBinarySearch(int[] a, int low, int high, int value)
	{  
		if (low <= high)
		{
			int mid = (low + high) / 2;

			if (a[mid] == value) 
			{
				return mid;
			}
			else if (a[mid] < value )
			{
				return internalBinarySearch(a, mid + 1, high, value);
			}
			else
			{
				return internalBinarySearch(a, low, mid - 1, value);
			}         
		}
		else 
		{
			return -1;
		}
	}
}
