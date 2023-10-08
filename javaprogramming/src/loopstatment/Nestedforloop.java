package loopstatment;

public class Nestedforloop {
	int n= 4;
    int m= 5;                      //hollow rectangle

	 public void a1()
	{     
		 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1|| j==1|| i==n || j==m)
				{
					System.out.print("*");    // by using print star
				}
				else
				{
					System.out.print(" ");     //using this print by space create
				}
			}
			System.out.println();           // using this println by goes to next line
				
		}
	}
	 public static void main(String[]args)
	 {
		 Nestedforloop s = new Nestedforloop();
		 s.a1();
	 }
	
	
	
	

}
