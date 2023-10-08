package javaprogramming;

public class Staticvaribles1 {

	public String B1 = "banking";  //static variable //
	static int K1 = 500;

	public static void main(String[] args) {



		System.out.println("this is a atm");
		Staticvaribles1 crime = new Staticvaribles1();
		crime.D1();

		D2();

	}
	public void D1()
	{
		System.out.println("manager =" + B1);

	}
	public static void D2()

	{
		System.out.println("account ="+K1);
	}
}


