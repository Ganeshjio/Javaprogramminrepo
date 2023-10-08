package standardjava;

public class Methodcallingoutside {
	
  public static void akshay() {
  System.out.println("best actor")	;
  
	    
  }
	public void dhoni() {
	System.out.println("best captian")	;
		
	}

	  public static void main(String[] args) {
		  
		  Methodcallingoutside s = new Methodcallingoutside();
		  s.dhoni();
		  akshay();
		  
		  Methodcallingwitinclass.sachin();
		  Methodcallingwitinclass k = new Methodcallingwitinclass();
		  k.sonu();
		  
	  }
		  
	  }
