package Lab1Question4;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter a number");
		  int n=sc.nextInt();
		 
		  for(int i=2;i<=n;i++) {
			int  count=0;
		  for(int j=2;j<=i/2; j++) {
			  if(i%j==0)
			  {
				  count++;
				  break;
			  }
		  }
		  if(count==0) {
			  System.out.println(i);
		  }
		  
		  } 
			  
	}

}

