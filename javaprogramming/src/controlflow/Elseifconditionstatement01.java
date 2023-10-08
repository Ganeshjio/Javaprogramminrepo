package controlflow;

public class Elseifconditionstatement01 {
	
	 int ticket = 260;
	 public void m1() {
		 
	if (ticket >=200 && ticket <=100) {
		System.out.println("auragabad to pune distane -200km ");
	}
	else if(ticket>=250 && ticket <300) {
		System.out.println("pune to nashik distance-250km");
	}
	else if(ticket>=450 && ticket <560) {
		System.out.println("kallam to mumbai distance-520km");
	}
	
	else {
		System.out.println("i am very enjoy a tripe");
	}
	
}

        public static void main(String[] args) {
	  Elseifconditionstatement01 v = new Elseifconditionstatement01();
             v.m1();
}
}
	


