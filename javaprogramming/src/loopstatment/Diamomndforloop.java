package loopstatment;

public class Diamomndforloop {
	int n =9;
	 
	public void m1()
	
	{
		
		//outer loop
		for(int i=1;i<=n;i++)
		{	
			//spaces
		for(int j=1;j<=n-1;j++)
		{
			System.out.print("  ");
			
		}
		 //star
		                            
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print("* ");
			}
		
			System.out.println();
		}		
			
		
      //lower half	
	   for(int i=n;i>=1;i--)
	{	
	   for(int j=1;j<=n-1;j++)
	{
		System.out.print("  ");
		
	}
	                             //space = 2*(n-1)
		for(int j=1; j<=2*i-1;j++)
		{
			System.out.print("* ");
		}
	
		    System.out.println( );
		}
		
	}		
		

  public static void main(String[] args)
  {
	  Diamomndforloop v = new Diamomndforloop();
	    v.m1();
  }
  }
