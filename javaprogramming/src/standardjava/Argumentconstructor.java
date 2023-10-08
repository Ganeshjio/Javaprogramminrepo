package standardjava;

public class Argumentconstructor {

  //declaration
	String name;
	long mobno;
	String email;
	
	//inilization
	public  Argumentconstructor() {
	System.out.println("this is pure veg restratunt");
	name = "mauli";
	mobno = 9933668854l;
	email = "maulihptel55gmail.com";
	
	System.out.println("name = "+ name + "\n" + "mobno =" + mobno + "\n" + "email =" + email );
	
	
	}
	
      public Argumentconstructor(String a)
      {
    	  System.out.println("famous of a ="+a);
    	  System.out.println("this is non veg restratunt");
    	  name = "sanket";
    	  mobno = 9922554433l;
       	 email = "sssanket44gmail.com";
       	System.out.println("name = "+ name + "\n" + "mobno =" + mobno + "\n" + "email =" + email ); 
    	  
      }
        public static void main(String[] args) {
        new Argumentconstructor();
        new Argumentconstructor("non veg");
        
        }
     
}
