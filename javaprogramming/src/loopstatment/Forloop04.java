package loopstatment;
import java.util.Scanner;

public class Forloop04 {
   int n;
   
   public void m1() {
	   System.out.println("enter any number");
	   Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.close();
	   for( n=1; n<=100; n++) {
		 
		   if(n%1==0 ) {
					   
		   }
		   
	   }
	     if(n==2) {
	    	 System.out.println("prime number");
	     }
	    	 else {
	    		 System.out.println("not prime number"); 
	    	 }
	     }
   
   public static void main(String[] args) {
	   Forloop04 v = new Forloop04();
	   v.m1();
	   
	   
   }	   
   
}
