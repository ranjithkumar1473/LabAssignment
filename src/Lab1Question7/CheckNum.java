package Lab1Question7;
import java.util.*;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNum c=new CheckNum();
		c.checkNumber();
		

	}
	void checkNumber()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		int c=num%10;
		num=num/10;
		boolean flag=false;
		while(num>0)
		{
			if(c<=num%10)
			{
				flag=true;
				break;
			}
			c=num%10;
			num=num/10;
		}
		if(flag) System.out.println("numbers are not in increasing order");
		else System.out.println("numbers are  in increasing order");
	}

}
