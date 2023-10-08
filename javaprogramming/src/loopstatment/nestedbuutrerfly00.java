package loopstatment;

public class nestedbuutrerfly00 {
	 int n=8;
	
	public  void m1()
	
	{
		//upper part
		for(int i=1;i<=n;i++)     //
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
			}
			 int spaces = 2 * (n-i);   //
			 for(int j=1; j<=spaces; j++)
			 {
				 System.out.print(" "); 
			 }
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print("*");
				 
			 }
			 System.out.println();
		}
		
		//lower part
		
		for(int i =n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			int spaces = 2 * (n-1);
			for(int j=1; j<=spaces; j++)
			{
				System.out.print(" "); 
				
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
		public static void main(String[] args)
		
		{
			nestedbuutrerfly00 v = new nestedbuutrerfly00();
			  v.m1();
		}
	}
	


