package controlflow;

import java.util.Scanner;

public class UserInput01 {
	
	static String name ;
	static long mobno ;
	static int age ;
	
	public static void m1() {
		
		System.out.println("--Enter the below details to Open Bank Account in Kotak--");
		System.out.println("Enter your Full Name");
		// Class - Scanner 
		// How to use Class?
		// Way -> 1) By Creating Object 
		Scanner s1 = new Scanner(System.in);
		name = s1.nextLine();
		System.out.println("You have Entered your Name = " + name);
		System.out.println("Enter your Mobile Number");
		mobno = s1.nextLong();
		System.out.println("You have Entered your Mobile Number = " + mobno);
		System.out.println("Enter your Age");
		age = s1.nextShort();
		System.out.println("You have Entered your Age = " + age);
		System.out.println("---Thank You From Kotak Bank---");
		s1.close();
	}


	public static void main(String[] args) {
	
		m1();
	}
	
}
	
	
	


