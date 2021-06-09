package datastructure;

public class MainArray {

	public static void main(String[] args) {
		int[] arr = new int[7];
		arr[0] = 20;
		arr[1] = 10;
		arr[2] = 0;
		arr[3] = -20;
		arr[4] = 90;
		arr[5] = 70;
		arr[6] = -920;
		int index=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==-20) {
			index=i;
			break;
		}
	}
	System.out.print(index);
	}

}
