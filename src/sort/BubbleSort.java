package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 20, 35, -15, 7, 55, 1, -22, 20, 35, -15, 7, 55, 1, -22 };

		for (int lui = arr.length - 1; lui > 0; lui--) {
			for (int i = 0; i < lui; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);					
				}
			}
		}
		for(int i:arr)
			System.out.println(i);
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
