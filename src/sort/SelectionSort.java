package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 20, 35, -15, 7, 55, 1, -22 };

		for (int lui = arr.length - 1; lui > 0; lui--) {
			int largest =0;
			for (int i = 1; i <= lui; i++) {
				if (arr[i] > arr[largest]) {
					largest = i;					
				}
			}
			swap(arr, largest,lui);
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


