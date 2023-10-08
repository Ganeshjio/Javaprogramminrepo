package controlflow;

public class Else_ifcindition {

	public static void main(String[]args) {
		int seat=35;
		
		if(seat>=155 && seat<=220)
		{
			System.out.println("second largest party");
		}
		
		else if(seat>=220 && seat<=273)
		{
			System.out.println("loksabha win a party");
		}
		
		else if(seat>=50 && seat<=100)
		{
			System.out.println("this performance is very low");
		}
		
		else 
		{
			System.out.println("this is deposite japta");
		}
			
			
	}
} 
