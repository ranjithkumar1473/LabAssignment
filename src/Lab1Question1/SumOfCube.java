package Lab1Question1;
import java.util.*;

public class SumOfCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfCube s= new SumOfCube();
		s.sumCube();

	}
	void sumCube()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n;i++)
		{
			sum+=i*i*i;
		}
		System.out.println("sum of the cubes is: " +sum);
	}

}

