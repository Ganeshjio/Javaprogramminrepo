package controlflow;
import java.util.Scanner;

public class UserInput05 {
	
	
  int b;
	
	
	 public  void m1() {
		 System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		b = scan.nextInt();
		scan.close();
		
		
		// for(int b=1100; b<=1900;b++) {
			
		//}	
		if(b%2==0 ) {	
		if(b%2==0  & b>=1100) {
			
		System.out.println("you have printed even number");
		}
		
		else {
			System.out.println("you have printed odd number");
		}	
		}
	 }
	public static void main(String[] args)
	{  
		
		UserInput05 v = new UserInput05();     //if(number%2==0)
		          v.m1();
	
}

}


