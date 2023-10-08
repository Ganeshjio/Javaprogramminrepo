package controlflow;

public class Switchstatementcondition02 {
	
	
	
	//Declration

	    String billno ="eight two";		
		int amount;
		int srno;
		//String Item;
		int Quantity;
		int Rate;
		int TotalAmount;
		Switchstatementcondition02()
		{
			billno = "eight two";
			System.out.println("Provide below details:" + "\n" +"billno:" + billno);

			System.out.println("..WELCOME.." );
		}
		public void customer(int srno1,String billno1,int Quantity1, int Rate1, int TotalAmount1)
		{
			System.out.println("\n" + "SR.No:"+srno1 +"\n" + "billno:"+billno1 + "\n" + "Quantity:"+Quantity1+ "\n" +"Rate:"+Rate1 + "\n" +"Total Amount:"+TotalAmount1);
			switch(billno)
			{
			case "eight two":
				if(amount>=20 && amount<=100) 
				{
					System.out.println("\n"+"Item List:" + "\n" + "Sugar" + "\n" + "Salt" + "\n" +"soap" + "\n" + "Colgate" + "\n" + "Maggy" + "\n" + "Tea Powder" + "\n" + "Goundnut");
				}
	          break;
				
			default:System.out.println("Sorry for Inconvience");
			}
		}
		
        public static void main(String[] args) {
        	Switchstatementcondition02 v = new Switchstatementcondition02();
        	 v.customer(1,"sugar",2,40,80);
	}

}
