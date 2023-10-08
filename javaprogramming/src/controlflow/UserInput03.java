package controlflow;

import java.util.Scanner;

public class UserInput03 {
	int a = 18;
	
	public void m1() {
	Scanner scan = new Scanner(System.in);
	  a = scan.nextInt();
	  scan.close();

	  if(~a<=(-20)) {	
			
			System.out.println("flipping operation is done");
		}
		
		else {
			
			System.out.println("flipping operation is not done");
		}	
		}
		
		public static void main(String[] args) {
			
			UserInput03 v = new UserInput03();
			v.m1();
			
		}
		
	}
	
	
	
	


