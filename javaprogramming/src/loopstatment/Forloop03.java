package loopstatment;

public class Forloop03 {
	int g ;
	                                                  //even and odd number printed 
	  public void a1()
	  {                                            
		  System.out.println("List of Even nmber");
		  
		  for(g=1100; g<=1900; g++)
		  {
	 		  if(g%2==0)
			  {
				 System.out.println("printed Even Number:"+g); 
			  }
	 		  else
			  {
				  System.out.println("printed odd Number:"+g);
			  }
		  }
		  
	  }
	  public static void main(String[]args)
	  {
		  Forloop03 s = new Forloop03();
		  s.a1();
	  }
	}
	
	
	
	
	


