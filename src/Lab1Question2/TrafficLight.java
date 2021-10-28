package Lab1Question2;
import java.util.*;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.out.println(" select any one of the option given below:");
  System.out.println("select 1 for Red ");
  System.out.println("select 2 for yellow ");
  System.out.println("select 3 for green ");
  System.out.println("select your option ");
  
  
  Scanner sc= new Scanner(System.in);
  int s=sc.nextInt();
  TrafficLight t= new TrafficLight();
  
  switch(s)
  {
  case 1:
	    t.red();
	    break;
  case 2:
	  t.yellow();
	  break;
  case 3:
	  t.green();
	  break;
	  default :
		  System.out.println("wrong option selected");
	  
  }
  
  
  }
	void red()
	{
		System.out.println("stop.");
	}
	void yellow()
	{
		System.out.println("ready.");
	}
	void green()
	{
		System.out.println("go.");
	}

}
