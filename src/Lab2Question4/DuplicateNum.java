package Lab2Question4;

import java.util.Arrays;

public class DuplicateNum {

	public static int modifyArray(int arr[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int arr[] = {  70, 40, 20, 30, 80, 70, 10 };
		Arrays.sort(arr);// 
		int length = arr.length;
		length = modifyArray(arr, length);
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Descending Order");
		for (int i = 0; i < length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print(arr[length - 1]);

	}

}