package Lab1Question5;
import java.util.*;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		SumOfNaturalNum f=new SumOfNaturalNum();
		System.out.println("the sum of the first natural numbers is : "+ f.calculateSum(n));

	}
	int calculateSum(int num)
	{
		int sum=0;
		for(int i=0;i<num;i++)
			
		{
			if(i % 3==0 && i % 5==0)
				sum+=i;
		}
		return sum;
	}

}
