package javaprogramming;

public class Allvaribles {
	
	String name; 
	long mobno;
	String email;
	byte establish;

	public void bjp() {
		 name = "bjp party"; 
		 mobno = 9860358820L;
		 email = "nationalbjp920@gmail.com";
		 establish = 39;
		System.out.println("bjp");
		System.out.println("(1) Name = " + name);
		System.out.println("(2) Mobile Number = " + mobno);
		System.out.println("(3) Email ID = " + email);
		System.out.println("(4) establish = " + establish);
		
	}

	public void inc() {
		 name = "congress party";
		 mobno = 9422556688L;
		 email = "congressr110@gmail.com";
		 establish = 80;
		System.out.println("congress");
		System.out.println("(1) Name = " + name);
		System.out.println("(2) Mobile Number = " + mobno);
		System.out.println("(3) Email ID = " + email);
		System.out.println("(4) establish = " + establish);
	
	}

	public static void main(String[] args) {
		Allvaribles t = new Allvaribles();
		t.bjp();
		t.inc();
		
	}
		
}
	
	
	
	
	
	
	
	
	
	


