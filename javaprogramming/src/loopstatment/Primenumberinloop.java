package loopstatment;

public class Primenumberinloop {
	
	int k=5000;
	int l=10000;              //prime number in between 5000 to 10000
	int i;                     //  
	int j;

	public void m1()
	{
		System.out.println(" printed prime number in between 5000-10000");
		for(i=k;i<=10000;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
			    break;
			}
			  if(i==j)
			{
				System.out.println(j);
			}
				
		}
	}
	           public static void main(String[]args)
	         {
	            Primenumberinloop s = new Primenumberinloop();
	                 s.m1();
	            }
	}
	
	
	
	
	
	


