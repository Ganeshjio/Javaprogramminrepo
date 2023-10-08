package controlflow;

public class controlflow01 {

	int b = 21;

	public  void m1() {

		if(b%2==0) {

			System.out.println("you have printed even number");
		}
		
		else 
		{

			System.out.println("you have printed odd number");
		}
	}


	public static void main(String[] args)
	{  

		controlflow01 v = new controlflow01();     //if(number%2==0)
		v.m1();

	}

}