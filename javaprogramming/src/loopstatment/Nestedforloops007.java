package loopstatment;

public class Nestedforloops007 {
	int i;
	public void m1()
	
	{
		int p =0;         //num=10   , sum =0,int i
		                  //sum = sum+i;
		int a = 10;
		
		
		for(int i =1; i<=a; i++)  //
		{
			p=p+i;
			System.out.println("p of first 10 print natural number="+p);
		}	
		
	}
	
		public static void main(String[] args)
		
		{
			Nestedforloops007 v = new Nestedforloops007();
			 v.m1();
			
		}
}
