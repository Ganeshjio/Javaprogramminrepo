package controlflow;

import java . util.Scanner;

public class UserInput06 {
	int a ;

	public void m1()
	{
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		scan.close();
		
		
		if(a<=7) {
			
		System.out.println("rainbow show in red colour");
		
		
		} else {
			System.out.println("not show to rainbow colour");
		}
		
	
}
	
  public static void main(String[] args) {
	  UserInput06 v = new UserInput06();
	  v.m1();
  }
	  
  }



