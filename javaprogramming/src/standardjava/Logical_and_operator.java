package standardjava;

public class Logical_and_operator {
	
	// False && True/False
	
		public static void main(String[] args) {
			
			int p = 400;
			int q = 350;
			int r = 550;
			int s = 600;
			
			// Logical And =  [&&] 
			System.out.println(r>q && s>p);// true && true = true
			System.out.println(q<s && p>q);// true && true = true
			System.out.println(r<q && p>r); // false && --(false) = false
			System.out.println(q==s && s>p);//  false && --(true) = False
			
			
			
			
		}
	
	
}
	
	
	
	
	


