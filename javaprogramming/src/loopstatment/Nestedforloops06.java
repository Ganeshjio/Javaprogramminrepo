package loopstatment;

public class Nestedforloops06 {
	int i;
	int j;
	int k;
	
	public void m1(){
		{
		for(i=1;i<=4;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print("");
				
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
			 Nestedforloops06 v = new Nestedforloops06();
			    v.m1();

		  }
	}
	

	
	
	
	


