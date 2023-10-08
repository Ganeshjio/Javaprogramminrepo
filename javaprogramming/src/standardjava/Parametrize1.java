package standardjava;

public class Parametrize1 {
	
	String fullname;
	int rollno;
	long mobno;
	 
	
	// argument constructor
	
	 Parametrize1(String fullname1, int rollno1, long mobno1) {
	 System.out.println("student information");
	 fullname = fullname1;
	 rollno = rollno1;
	 mobno = mobno1;
	 
	}
	
	public void printform() {
	System.out.println(" ----the student exam---");
    System.out.println("full name is ="+ fullname);
	System.out.println("roll no is ="+ rollno);
	System.out.println("mob no is ="+ mobno);
				
	}
	 public static void main(String[] args) {
	 Parametrize1 ashok = new Parametrize1("ashok mane",125464,9855331455l);
	 ashok.printform();
	 Parametrize1 sunil = new Parametrize1("sunil kulkarni", 254896, 9833665544l);
	 sunil.printform ();
		 
		 
	 }
	
	
}
