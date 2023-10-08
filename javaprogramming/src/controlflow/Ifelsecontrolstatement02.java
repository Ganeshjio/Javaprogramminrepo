package controlflow;

public class Ifelsecontrolstatement02 {
	
	int a = 18;
	
	public void m1() {   //-(18+1) = -19
		
	if(~a<=(-20)) {	
		
		System.out.println("flipping operation is done");
	}
	
	else {
		
		System.out.println("flipping operation is not done");
	}	
	}
	
	public static void main(String[] args) {
		
		Ifelsecontrolstatement02 v = new Ifelsecontrolstatement02();
		v.m1();
		
	}
	
}
		
	
	


