package controlflow;

public class Nested_if {
	
	int a =20;
	int b = 10;
	public void a1()
	{
		if(a++==20)
		{System.out.println("positive test covid");
			if(--a==10)
			{
				System.out.println("negative test covid");
			}
		}
	}
	public static void main(String[]args)
	{
		Nested_if s = new Nested_if();
		s.a1();
	}
	}


