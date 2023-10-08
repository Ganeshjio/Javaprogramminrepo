package controlflow;

import java.util.Scanner;
public class UserInput04 {

	int x = 75;
	int y = 60;
	
	public void m1() {
		Scanner scan = new Scanner(System.in);
		  y = scan.nextInt();
		  scan.close();

		
	if (x>y) {
		
	System.out.println("a grade");
	
	}
	else {
		
		System.out.println("b grade");
	}
	}
		

  public static void main(String[] args) {
	  
	  UserInput04 v = new UserInput04();
	  v.m1();
  
  }
  
  }
	
	
	

