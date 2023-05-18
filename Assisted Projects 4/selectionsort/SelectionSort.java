package selectionsort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		 int[] arr = {17,12,18,15,11,19,13,16,14};
		 
		 System.out.println("GIVEN ARRAY : " + Arrays.toString(arr));
		 
		 selectionSort(arr);
		 
		 System.out.println("SORTED ARRAY : " + Arrays.toString(arr));	 

	}

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[minIndex]) {
					minIndex = j;
				}

			}
			
			// swap if i and minIndex are at diff positions
			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}

		}

	}

}