

package Lab1Question3;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0,b=1,c=0;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter a Nth number");
	     int n=sc.nextInt();
	     int count=0;
	     for(c=0;c<Integer.MAX_VALUE;)
	     {
	    	 count++;
	    	 c=a+b;
	    	if(count==n-1)  System.out.print("the Nth numbr is: "+c);
	    	 a=b;
	    	 b=c;
	     }

	}

}