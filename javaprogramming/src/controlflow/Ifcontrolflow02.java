package controlflow;

public class Ifcontrolflow02 {
	
	// problem Statements -> Print a msg in cosole that "You have entered 
		// number between 1-75
		// Build Logic First - Given number should be greater than or equal to 1 AND Number should be less than or equal to 75
		// Build Program
		static int a = 99;
		public static void main(String[] args) {
			System.out.println("We are runiing If Statements");
			if (a>=1 && a<=75) {
				System.out.println("You have entered number between 1-75 ");
			}
			
			System.out.println("Ye IFA tuza ani maza kahi sambadh nahi bagh");
			s1();
			
		}
		
		public static void s1() {
			
			if (a>=1) {
				System.out.println("Your Number is greater than 1");
			}
			
			if (a<=75) {
				System.out.println("Your number is less that 75");
			}
		}
		
	}


