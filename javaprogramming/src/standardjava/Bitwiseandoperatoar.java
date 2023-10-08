package standardjava;

public class Bitwiseandoperatoar {
	
	public static void main(String[] args) {

		   int s = 450;    // bitwise and operator
		   int p = 400;    // only single [&]
		   int q = 500;    // first condition is false then does'nt check next condition because the result is = false
		   int r = 600;

				
		               // Bitwise AND = &
			System.out.println(r>q & s>p); // true & true = True		
		        System.out.println(q<s & p>q); // false & false = False
			System.out.println(r<q & p>r); // false & false = False  
		        System.out.println(q==s & s>p); // False & True = false
		        System.out.println(q>p & p>s); // true & false = false
	}
	
}
	
	
	
	
	
	
	
	
	


