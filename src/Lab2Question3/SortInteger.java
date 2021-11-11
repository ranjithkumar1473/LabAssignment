package Lab2Question3;
import java.util.Arrays;

public class SortInteger {

	public static int getSorted(int arr[], int n) {
		System.out.println("Reverse order:");
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + "  ");

		Arrays.sort(arr);
		
		System.out.println("\nSorted Order:");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 309, 450, 680, 160, 240 };
		int n = arr.length;
		SortInteger.getSorted(arr, n);
		
		

	}

}