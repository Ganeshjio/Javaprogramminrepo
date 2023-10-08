package standardjava;

public class Constrcutor {
	//Declaration
	String name;  // zero argument
	long mobno;
	String email;
	byte establishment;

		//installation
	  Constrcutor(){     // class name()
	  name = "state bank of india";
	  mobno = 8205326588l;
	  email ="sbiindia55@gmail.com";
	  establishment = 50;
	 
	}
	
     public void sbi() 
     {   		 	
        System.out.println("name ="+name);
        System.out.println("mobno ="+mobno);
        System.out.println("email ="+email);
         System.out.println("establishment ="+establishment);
     }
             
          public static void main(String[] args) {
         Constrcutor r = new Constrcutor();
	      r.sbi();
	    
	    	
	       	    	
	    	
	       }
}
