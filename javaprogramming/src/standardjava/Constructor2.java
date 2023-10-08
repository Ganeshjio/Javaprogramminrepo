package standardjava;

public class Constructor2 {
	// 1) Declaration
			// Instance Variable
			String name; 
			long mobno ;
			String email;
			byte age;
			
			// 2) Initialization 
			// Constructor - Special Member of Class 
			// What exactly we initialize -> Variable ?
			// Member = Method = Function = Member function = method function
			// 1) To Initialize the Data Member(Variable) of Class
			// 2) To Load non static member of a class into Object.
			
			// Create Constructor
			Constructor2(){
				name = "Lina Bhamare"; // 2 byte
				mobno = 9373203466L;// 8 Byte
				email = "linabhamare1990@gmail.com";// 4 byte
				age = 23;// 1 byte
			}
			
			// 3) Usage
			public void linaInfo() {
				System.out.println("---Personal Infomartion---");
				System.out.println("(1) Name = " + name);
				System.out.println("(2) Mobile Number = " + mobno);
				System.out.println("(3) Email ID = " + email);
				System.out.println("(4) Age = " + age);
				System.out.println("--- Thank You ---");
			}

			public static void main(String[] args) {
				Constructor2 b = new Constructor2();
				b.linaInfo();	
	
	
	
			}
			
}
	
	
	
	
	
	
	
	


