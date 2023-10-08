package controlflow;

public class Naturalnumber {

	int a=10;

	public void m1()
	{

		System.out.println("printed natural number up to 10");

		for(int i=1; i<=a; i++)
		{
			
			System.out.println(i +" ");
		}


	}

	public static void main(String[] args)
	{
		Naturalnumber b = new Naturalnumber();
		b.m1();
	}
}







