package controlflow;

public class Switchstatementcondition {
	
	int budget = 1;
	String vehicle = "spshine";
    String scootey;
    String bike;
	
	
	 public void m1() {
		 
		 System.out.println("Welcome to my showroom ");
		 System.out.println("your budget is in between 100000-200000 ,then avialbale different different of bikes and scooty this budget");
	     
		switch(budget)
		{
		case 1:System.out.println("To purchess bike spshine 125cc-102000/-");break;
		case 2:System.out.println("To purchess bike splender in all colour-80000/-");break;
		case 3:System.out.println("To purchess bike bullet 200cc-20000/-");break;
		case 4:System.out.println("To purchess bike k-10 -150000/-");break;
		case 5:System.out.println("To purchess scooty Activa-10000/-");break;
		case 6:System.out.println("To purchess scooty Jupiter-105000/-");break;
		case 7:System.out.println("To purchess scooty vaspa1-90000/-");break;
		case 8:System.out.println("To purchess scooty Mastro- 115000/-");break;
		
		default:System.out.println("sp shine model red colour is not avilable");
		
		}
		
	}
              public static void main(String[] args) {
        	 Switchstatementcondition v = new Switchstatementcondition();
        	     v. m1();
        	    
	   
   }
}
