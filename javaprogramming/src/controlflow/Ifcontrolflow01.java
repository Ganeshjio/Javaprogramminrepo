package controlflow;


public class Ifcontrolflow01 {
	
	int num = 442;         //if_else statement
	
  public  void m1() {
	  
	    
    if (num%5==0) {
    System.out.println("only number is divisible by 5");
    
    
    }
    else {
    System.out.println("number is not divisible by 5");	
    }
    
  }
    public static void main(String[] args) { 
    
    	Ifcontrolflow01 v = new Ifcontrolflow01();
    	v.m1();
    		
    	
    }
  
}
