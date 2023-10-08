package loopstatment;

public class Nestedforloops02 {

	int n=4;

	public void m1()
	{
		
		for(int i=1;i<=n;i++) 
		{	
			
		for(int j=1;j<=(n-1);j++)
		{
			System.out.print(" * ");
		}
		 for(int k=i;k<=(2*i);k++) {
		 }	 
		  System.out.print(" ");
		 
		  
			System.out.println();
		}
	}


  public static void main(String[] args)
  {
	  Nestedforloops02 v = new Nestedforloops02();
	    v.m1();
  }
	  
  }