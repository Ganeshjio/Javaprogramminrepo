package loopstatment;

public class Nestedforloops01 {
	
	int n =4;
	
	
	public void m1()
	{
		for(int i=n;i>=1;i--)   //outer loop
		{
			for(int j=1;j<=i;j++) //inner loop  //
			{
				
				System.out.print(" *"); 
				
			}	
				System.out.println( );
			
		}
	}

	
	 public static void main(String[] args)
	 {
		 Nestedforloops01 v = new Nestedforloops01();
		   v.m1();
	 }
}

