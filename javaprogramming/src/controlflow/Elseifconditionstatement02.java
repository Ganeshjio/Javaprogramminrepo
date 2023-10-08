package controlflow;

public class Elseifconditionstatement02 {
	
	short staionary = 44;
	
	public void m1() {
	
		if (staionary >=12 && staionary <=25) {
		 System.out.println("i want to purchess pen");
		 
		}
		else if (staionary >=26 && staionary <=45) {
        	 System.out.println("i want to purchess book");	
        	 
	} 
		 else if (staionary >=46 && staionary <=60) {
        	 System.out.println("i want to purchess notebook");		
	}
	   
		 else   {
        	 System.out.println("i want to all staionary");		
	
}
	}
	  public static void main(String[] args) {
		  Elseifconditionstatement02 v = new Elseifconditionstatement02();
		     v.m1();
	  }
		
	}