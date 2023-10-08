package standardjava;

public class Methodcallingwitinclass {
	
  public static void sachin() {
	System.out.println("best player");
		  
	  
  }
	
    public void sonu() {
     System.out.println("best singer");
     
    	
    }
    
    public static void main(String[] args) {
    
    	Methodcallingwitinclass k = new Methodcallingwitinclass();
    	
    	k.sonu();
    	sachin();
    	
    }
}
