 package standardjava;

 public class Bitwiseor {
	 
	                                              //Bitwise (or |)//
                                                 //in condition is true then result is also true 	
 public static void main(String[] args) {
	 int a = 500;
	 int b = 200;
	 int c = 600;
	 int d = 400;
	 
	 System.out.println(a>b|b<c);// true or false = true
	 System.out.println(a>d|d<b);// true or false = true
	 System.out.println(d>c|b>c);// false or false = false
	 System.out.println(a<c|b>d);// true or false = true
	
}

}
