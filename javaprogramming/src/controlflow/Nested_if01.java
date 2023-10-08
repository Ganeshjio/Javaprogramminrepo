package controlflow;

public class Nested_if01 {
	int a;
	int b;
	
	Nested_if01()

	{
		a=44;
		b=62;

		if(a<b)     //outer if(execute when condition is true in 1)
		{
			System.out.println("a is greatter  than b");
			
			if(a>b)     //inner if(execute when condition is true in 1 and 2)                                 
			{
				System.out.println("b is less than a");
			}

		}

	}
	public static void main(String [] args)
	{

		new Nested_if01();
	}
}