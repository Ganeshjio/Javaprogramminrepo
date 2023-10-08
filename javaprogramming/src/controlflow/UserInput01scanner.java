package controlflow;

import java.util.Scanner;
public class UserInput01scanner {
	
	int a;
	
	public void m1() {   // 
		
		System.out.println("enter the number" );
	
		Scanner scan = new Scanner(System.in);
		 a = scan.nextInt();
		 scan.close();
		 
		 if(a%1==0 && a%2!=1 ) {
			 System.out.println("you have printed prime number"); 
		 }
		 if(a%2==0 && a>=0) {
			 System.out.println("you have  printed even  number");
		 }
		 else {
			 System.out.println("you have not related  number"); 
		 }
			  
}
		  public static void main(String[] args) {
	     
		  UserInput01scanner v = new UserInput01scanner();
		  v.m1();
		  
}
}
