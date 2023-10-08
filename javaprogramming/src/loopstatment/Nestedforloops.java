package loopstatment;

public class Nestedforloops {       
	
	int a;
	int b;
	
	public void m1() {
		
		
	for(int a=1; a<=4;a++) 
	{
		for(int b=1; b<=a;b++) 
		{				
	 System.out.print(" * ");
  } 
	 System.out.println(" ");
	
	}
	}	
    public static void main(String[] args) {
    	Nestedforloops v = new Nestedforloops();
    	  v.m1();
    	
    }
}
