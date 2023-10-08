package standardjava;

public class UserDefine_Parametric_Args_constructor_03 {

	// declaration//         // argument change name
  String fullname;
  long voterno;
  int code;
  
   // initialization //
  
  UserDefine_Parametric_Args_constructor_03(String fullname, long voterno, int code) {
       this. fullname = fullname;
    	this.voterno = voterno;
    	this.code = code;
    	
    	//usages//
    }  
    	public void printform()	{
        System.out.println(" -----business growth 2023-2024-----" );
        System.out.println("-------the company owner------");
        System.out.println(" full name is ="+ fullname);
        System.out.println(" voter no is = "+ voterno);
        System.out.println(" code is ="+ code);
    		
    				
    	}
    	
    	  public static void main(String[] args) {
    		  UserDefine_Parametric_Args_constructor_03 ambani = new UserDefine_Parametric_Args_constructor_03 ("sanjay ambani", 1245253654l, 155);
    	     ambani.printform();
    	  UserDefine_Parametric_Args_constructor_03 rahul = new UserDefine_Parametric_Args_constructor_03("ratan sane", 2564892187l, 455);
    	  rahul.printform();
    	
    	   	
    	
    	
    }
  
}
