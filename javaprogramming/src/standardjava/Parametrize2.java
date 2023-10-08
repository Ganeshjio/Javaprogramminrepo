package standardjava;

public class Parametrize2 {
	
	String fullname;
	int pincode;
	long accountno;
	String atomname;
	
	
	Parametrize2(String fullname1, int pincode1, long accountno1, String atomname1){
	System.out.println("---hotel information---");	
	fullname = fullname1;
	pincode = pincode1;
	accountno = accountno1;
	atomname = atomname1;
	
	
	}
	
	public void printform() {
	System.out.println(" the best hotel");
	System.out.println("full name is ="+ fullname);
	System.out.println("pincode no is ="+ pincode);
	System.out.println("account no is ="+ accountno);
	System.out.println("atom name is ="+ atomname);	
		
		
	}
	
	     public static void main(String[] args) {
		 Parametrize2 tara = new Parametrize2("tara hotel",125464,9855331455l,"dalfry");
		 tara.printform();
		 Parametrize2 mauli = new Parametrize2("mauli hotel", 254896, 9833665544l,"vegkofta");
		 mauli.printform ();
			 
	     }
	
	
	

}
