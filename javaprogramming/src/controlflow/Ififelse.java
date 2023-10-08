package controlflow;

public class Ififelse {
	int a=30;
	 int b=10;
	
	public void np()
	{
		if(a==b)
		{
		if(a!=b) 
		{
			System.out.println("a and b are equal no");
		}
		}
		else {
			System.out.println("a and b are not equal no");
		}
	  }
	

		public static void main(String [] args)
		{
			Ififelse D = new Ififelse ();
			D.np();
			
		}
		
	}

