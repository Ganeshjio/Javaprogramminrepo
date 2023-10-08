package loopstatment;

public class Nestedforloops08 {
	
	  public void m1()
	  {

	
	for(int i=1; i<=8;i++) 
	{	
		for(int j=8; j>=i; j--)
		{
		System.out.print(" ");
		}
		for(int a=1; a<=i; a++) 
		{
		System.out.print("  *");	
		}
		System.out.println();
	}
	
	
	for(int i=1; i<=8;i++) 
	{	
		for(int j=8; j>=i; j--)
		{
		System.out.print("  *");
		}
		System.out.println();
		
		for( int a=1; a<=i; a++) 
		{
		System.out.print(" ");	
		}
		
	}
	}
   public static void main(String[] args)
   
   {
	   Nestedforloops08 v = new Nestedforloops08();
	     v.m1();
   }
	}
