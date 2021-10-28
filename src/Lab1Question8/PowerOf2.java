package Lab1Question8;
import java.util.*;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOf2 p = new PowerOf2();
		p.checkNumber();

	}

	

	void checkNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int a = n;
		while (n > 1) {
			if (n % 2 != 0) {
				System.out.println(n + " is not a power of 2");
				break;

			}
			n = n / 2;
		}
		if (n < 2)
			System.out.println(a + " is a power of 2");
	}
}
