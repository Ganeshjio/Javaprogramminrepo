package standardjava;

public class Defaultmethod {
	
	String name;   // with argument 
	byte score;
	long mobno;


	  public Defaultmethod(int a) {
	  System.out.println("value of a =" +a);
	  System.out.println("this is positive valu");
	  name = "rahul";
	  score = 98;
	  mobno = 9833564477l;
	  System.out.println("name = "+ name + "\n" + "score =" + score + "\n" + "mobno =" + mobno );
	  }
	    public static void main(String[] args) {

		 new Defaultmethod(400);
		
	   }
	  }