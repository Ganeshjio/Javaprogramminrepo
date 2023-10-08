package controlflow;

import java.util.Scanner;
public class UserInput02 {
	
	int num = 442;
	
	  public  void m1() {
		  System.out.println("enter number");
		  Scanner scan = new Scanner(System.in);
		  num = scan.nextInt();
		  scan.close();  
		      
	    if (num%5==0) {
	    System.out.println("only number is divisible by 5");
	    
	    }
	    if (num%5!=0) {
	    System.out.println("number is not divisible by 5");	
	    
	    }
	    
	  }
	    public static void main(String[] args) { 
	    
	    	UserInput02 v = new UserInput02();
	    	v.m1();
	    		
	    	
	    }
	  
	}
	
	


