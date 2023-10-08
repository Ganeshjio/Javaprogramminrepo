package loopstatment;

public class Nestedforloops05 {
	int i;
	int j;
	int k;
	
	public void m1(){
		{
		for(i=1;i<=4;i++)
		{
			for( j=4;j>=i;j--)
			{
				System.out.print(" ");
				
			}
				for(k=1;k<=i;k++)	
				{
					System.out.print(" * ");
				}
				 System.out.println(); 
		  }		 
		}	
		
	}
		 public static void main(String[] args)
		  {
			  Nestedforloops05 v = new Nestedforloops05();
			    v.m1();

		  }
	}
	


