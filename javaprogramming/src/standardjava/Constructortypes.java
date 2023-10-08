package standardjava;

public class Constructortypes {

	// Arguments ? = args
		// Arguments = DataType with variable = Parameters
		
		// 1) Default Constructor
		String name;
		byte age;
		long mobno;
		
		
		public Constructortypes() {
			System.out.println("Non/Zero Argument Constructor");
			name = "James Bond";
			age = 100;
			mobno = 7777777777L;
			System.out.println("Name = " + name + "\n" + "Age = " + age + "\n" + "Mobile Number = " 
			+ mobno);
		}
		
		public Constructortypes(int a) {
			System.out.println("Value of a = " + a);
			System.out.println("One Argument Constructor");
			name = "Jamesi Bondi";
			age = 99;
			mobno = 666666666L;
			System.out.println("Name = " + name + "\n" + "Age = " + age + "\n" + "Mobile Number = " 
			+ mobno);
		}
		public Constructortypes(int a, String b) {
			System.out.println("Value of a = " + b);
			System.out.println("Value of a = " + a);
			System.out.println("Two Argument Constructor");
			name = "Danger Man";
			age = 17;
			mobno = 1717171717L;
			System.out.println("Name = " + name + "\n" + "Age = " + age + "\n" + "Mobile Number = " 
			+ mobno);
		}
		
		public static void main(String[] args) {
			// How should call Non/Zero argument Constructor in Main Method ?
			// new Constructor name with signature followed by semi colon 
			new Constructortypes();
			new Constructortypes();
			// How should call Argument Constructor in Main Method ?
					// new Constructor name with signature providing inside value of variable followed by semi colon 
			new Constructortypes(1000);
			new Constructortypes(123);
			new Constructortypes(123, "Mi Pn Danger");
		}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

