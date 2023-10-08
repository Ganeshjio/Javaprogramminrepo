package controlflow;

public class Ifcontrolflow03 {
	
	int a = 500;
	int b = 400;
	int c = 600;
	
	public void m1()
	{	
	if (a>b && a>c){
	System.out.println("a is largest number="+a);
		
	
	if (b>c && b>c) {
	System.out.println("b is largest number="+b);
	
	}
	
	}
	else{
		System.out.println("c is largest number="+c);
		
}
}
  public static void main(String[] args) {
	  Ifcontrolflow03 v = new Ifcontrolflow03();
	 v. m1();
	  
  }
	
	
	
}