package loopstatment;

public class Nestedforloops03 {
  int n=4;
  public void m1(){

	  {
		  for(int i=1;i<=n;i++)
		  {
			  for(int j=1;j<=(n-i);j++) 
			  {
				  
			 System.out.print("  "); 
			  }
			  for(int k=1;k<=(2*i)-1;k++)
			  {
			  System.out.print("* ");
		  }
			  System.out.println( );
		  }
	  }
	  }
  public static void main(String[] args)
  {
	  Nestedforloops03 v = new Nestedforloops03();
	    v.m1();
  }

}