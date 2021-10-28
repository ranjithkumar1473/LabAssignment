package Lab2Question1;
import java.util.*;
public class SecondSmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of elements");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Second Smallest number in a Array is: " + secondSmallest(arr,n));
	}
	 public static int secondSmallest(int[] arr2, int a) {
		int i,b = 0;
		for(  i=0;i<a;i++)
		{
			if(arr2[i]!=arr2[i+1]) {
				
				 b=arr2[i+1];
				 break;
				
			}
	
		}
		return b;
	}
}
