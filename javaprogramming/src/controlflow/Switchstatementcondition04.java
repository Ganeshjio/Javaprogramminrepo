package controlflow;

import java.util.Scanner;

public class Switchstatementcondition04 {
	
	//Declaration of instance variables
		String CustomerName;

		Switchstatementcondition04()
		
		{
			CustomerName = "arjun";
			System.out.println("Provide below details:" + "\n"+ "Your Name: " + CustomerName);
			System.out.println("Welcome!!! " + CustomerName);

		}
		public void PurchaseBike( int budget, String Scooter_OR_Bike) {
		
		 Scanner scan = new Scanner(System.in);
		CustomerName = scan.nextLine();
		  scan.close();  
		
		
		{
			System.out.println("\n" +"Enter Budget: "+ budget + "\n" + "Enter details about what You want to Buy?? " + "\n"+ Scooter_OR_Bike);
			
			switch(Scooter_OR_Bike)
			{
			case "Scooter":
				if(budget>50000 && budget<=89000)
				{
					System.out.println("\n"+"Suggestions to buy Scooter:" + "\n" + "TVS Scooty pep"+ "\n"+ "TVS Jupiter" +"\n"+ "Hero Pleasure" +"\n"+ "Hero Destini" +"\n"+ "HONDA Activa 6G" +"\n"+ "YAMAHA Fascino125" +"\n"+ "Suzuki Access125");
				}
				else if(budget>30000 && budget<=50000)
				{
					System.out.println("\n"+"Suggestions to buy Scooter: " +"\n"+ "TVS XL100 Heavy Duty l" +"\n"+ "TVS XL100 Comfort I"+"\n"+"TVS XL100 Heavy Duty BS");
				}
				else
				{
					System.out.println("Sorry!!"+"\n"+"Product is not available with this range");
				}
				break;
			case "Bike":
				if(budget<100000)
				{
					System.out.println("\n"+"Suggestions to buy Bike: " +"\n"+ "Hero Splender" +"\n"+ "Bajaj Pulsar125"+"\n"+"HONDA SP125"+"\n"+ "YAMAHA FZ" +"\n"+ "HONDA Unicorn" +"\n"+ "HERO Passion");
				}
				else
				{
					System.out.println("\n"+"Suggestions to buy Bike: " +"\n"+ "Suzuki Intruder" +"\n"+ "Bajaj Pulsar150 ABS"+"\n"+"HONDA CB Hornet"+"\n"+ "YAMAHA MT" +"\n"+ "Suzuki Gixxer SF150" +"\n"+ "HERO XPulse");
				}
				break;
			default :
				{
					System.out.println(" Please provide correct information so we can help you");
				}
			}
		}
		}
		
		  public static void main(String[] args) {
			  Switchstatementcondition04 v = new Switchstatementcondition04();
			  v.PurchaseBike(250000,"bike");
			  
			  
		  }
	

}
