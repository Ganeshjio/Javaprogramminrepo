package javaprogramming;

public class Global3 {

 String name = "hi";
 String yes = "hello";
 byte age = 18;
 
 public void m2() {
 
 System.out.println("how are you");
 System.out.println("yes fine");
 System.out.println("your adult");
	  	 
 }
  public static void main(String[] args) {
	  Global3 v = new Global3();
	  v.m2();
	  Staticvaribles.m2();         //to practise to method calling
	  Staticvaribles adhar = new Staticvaribles();
		adhar.m1();
  }

}
