package loopstatment;

public class Nestedforloops04 {

	int i;
	int j;
	int k;
	int l;
	public void m1(){
		{
			for(i=1;i<=4;i++)
			{
				for( j=4;j>=i;j--)
				{
					System.out.print(" " );

				}
				for(k=1;k<=1;k++)	
				{
					System.out.print("* ");
				}
				for(l=2;l<=i;l++)
				{
					System.out.print("* ");

				}
				System.out.println(); 
			}         
		}		

	}
	public static void main(String[] args)
	{
		Nestedforloops04 v = new Nestedforloops04();
		v.m1();

	}
}
