package standardjava;

public class Logicalor {
	
  public static void main(String[] args ) {
	  
	  int a = 200;
	  int b = 500;
	  int c = 700;
	  int d = 800;
	  
	  System.out.println(a>b||b>c); // false || false = false
	  System.out.println(b>d||d>c); // false || true = true
	  System.out.println(b>c||c<d); // false || true = true
	  System.out.println(d<a||a>c); // false || false = false
	  System.out.println(a==b||b>a);// false || true = true
	  
	  
  }

}
