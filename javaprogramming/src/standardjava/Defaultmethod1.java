package standardjava;

public class Defaultmethod1 {
	
  String name;   //argument and non argument
  byte season;
  short code;
  
  
   public Defaultmethod1(){
   System.out.println("one number web series ");
   name = "the family man";
   season = 2;
   code = 3274;
   
   System.out.println("name = "+ name + "\n" + "season =" + season + "\n" + "code =" + code );
	   
   }
    
       public Defaultmethod1(String a) {
       System.out.println("two number web series a="+a);
	   name = "money heist";
	   season = 5;
	   code = 1254;
	   
	   System.out.println("name = "+ name + "\n" + "season =" + season + "\n" + "code =" + code );
    
       }
	  
	    public static void main(String[] args) {
	    new Defaultmethod1();
	    new Defaultmethod1("money heist");
	    
	    }

}
