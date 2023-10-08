package loopstatment;

public class Forloop02 {
	
	 public void m1() {                                     //print even number=1100-1900
		                                                    //print odd number = 1100-1900
		  System.out.println(" Even number list");          // by print even and odd simultaneously

		for(int h=1100;h<=1900;h++)
		{
		  if(h%2==0)
		  {
			  System.out.println("printed Even number:" + h);
		  }
		}
		
		  System.out.println("printed Odd number list");

		
		for(int h=1100; h<=1900; h++)
		{
			if(h%2!=0)
			{
				System.out.println("Odd number:" + h);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Forloop02 v = new Forloop02();
		 v.m1();
	
	
	}	

}
