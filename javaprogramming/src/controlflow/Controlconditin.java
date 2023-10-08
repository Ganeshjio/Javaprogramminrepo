package controlflow;

public class Controlconditin {
	int a ;
	 
	Controlconditin (int b)
	 {
		 a=b;
	 }
	 public void a1()
	 {                   //If Statement
		 if (a>=0)//  std.syntax.....if(){statement}
		 {
			 System.out.println("You have Entered Positive Number");
		 }
		 
		 System.out.println("You have Entered not Positive Number");
	 }
	 
	 
	 public static void main(String[]args)
	 {
		 Controlconditin b= new Controlconditin (10);
		 b.a1();
		 
	 }
	}
	
	
	
	
	
	
	


