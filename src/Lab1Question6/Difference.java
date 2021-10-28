package Lab1Question6;
import java.util.*;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Difference d= new Difference();
		d.calculateDifference();

	}
	void calculateDifference()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value");
		int n= sc.nextInt();
		int a=0, b=0;
		a=(n*(n+1)*(2*n+1))/6;
		
		b=(n*(n+1))/2;
		b=b*b;
		
		
		System.out.println("the difference is : "+ (b-a));
	}

}