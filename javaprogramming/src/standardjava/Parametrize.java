package standardjava;

public class Parametrize {
	
	// declaration//
  String fullname;
  long voterno;
  int code;
  
   // initialization //  argument constructor
  
    Parametrize(String fullname1, long voterno1, int code1) {
    	fullname = fullname1;
    	voterno = voterno1;
    	code = code1;
    	
    	//usages//
    }  
    	public void printform()	{
        System.out.println(" -----loksabha election 2023-2024-----" );
        System.out.println("-------the prime minister------");
        System.out.println(" full name is ="+ fullname);
        System.out.println(" voter no is = "+ voterno);
        System.out.println(" code is ="+ code);
    		
    				
    	}
    	
    	  public static void main(String[] args) {
    	  Parametrize narendra = new Parametrize ("narendra modi", 1245253654l, 155);
    	  narendra.printform();
    	  Parametrize rahul = new Parametrize("rahul gandi", 2564892187l, 455);
    	  rahul.printform();
    	
    	   	
    	
    	
    }
  
}
