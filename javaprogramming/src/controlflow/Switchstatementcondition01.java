package controlflow;

public class Switchstatementcondition01 {
	
	int budget = 20000;
	String mobiles = "vivo";
	
	public void m1() {
		
		
		System.out.println("Welcome to my mobile shop");
		 System.out.println("Branded mobile");
	
		switch (budget) {
		
		case 20000: System.out.println("purchess 256 gb radmi k3 note mobile-20000");break;
		case 25000: System.out.println("purchess 128 gb vivo y 73 mobile-25000");break;
		case 30000: System.out.println("purchess 064 gb samsung galaxyj2 mobile-30000");break;
		case 22000: System.out.println("purchess 112 gb nokia  mobile-22000");break;
		case 45000: System.out.println("purchess 256 gb one pulse mobile-45000");break;
		case 60000:	System.out.println("purchess 256 gb I phone 12 pro mobile-60000");break;
		case 15000: System.out.println("purchess 32 gb lenovo-15000");break;
		
		default:System.out.println("only branded mobile shop here");
			 
				
		}
	}
	 public static void main(String[] args) {
		 Switchstatementcondition01 v = new Switchstatementcondition01();
    	               v.m1();
}
}