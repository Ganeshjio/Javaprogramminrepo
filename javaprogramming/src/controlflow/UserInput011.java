package controlflow;
import java.util.Scanner;

public class UserInput011 {

		
		static String  Vehile1;
		static long  budget;
		static Scanner d;
		
		public void purchaseBike() {
			System.out.println("Welcome in our Showroom !! + "+"\n"+"What you want to Buy Bike or Scooter");
			d= new Scanner(System.in);
			Vehile1 = d.nextLine();
			System.out.println("Also Can you please tell your Budget So that I can show you something");
			budget =  d.nextLong();
			System.out.println("\n" + "Enterd Budget: " +budget + "\n" +
		"Entered Type of Vehicle is  " + "\n" + Vehile1 );
			
			switch (Vehile1) {
			
			case "Scooter": 
				if (budget> 50000 && budget<=100000) {
					System.out.println("\n" + " Sugeested Scooters According to your choice " + "\n" +"Hero Pleasure" + "\n" + "Honda Activa");
				}
				else if(budget>100000 && budget<= 200000) {
					System.out.println("\n" + " Sugeested Sports Scooters According to your choice " + "\n" +"Hero dio" + "\n" + "Honda grazia");
				}
				else if(budget> 200000) {
					System.out.println(" We Dont have Scooters in this range");
				}
				else {
					System.out.println(" We Dont have Scooters in this range. Defined Range is between 50000-200000");

				}break;
			case "Bike": 
				if (budget> 50000 && budget<=100000) {
					System.out.println("\n" + " Sugeested Bike According to your choice " + "\n" +"Hero Passon" + "\n" + "Honda Shine");
				}
				else if(budget>100000 && budget<= 200000) {
					System.out.println("\n" + " Sugeested Sports Bike According to your choice " + "\n" +"Hero lio" + "\n" + "Honda Unicorn");
				}
				else if(budget> 200000) {
					System.out.println(" We Dont have Bike in this range");
				}
				else {
					System.out.println(" We Dont have Bike in this range. Defined Range is between 50000-200000");

				}break;
			}
		}
	
	
		public static void main(String[] args) {
			
			UserInput011 p = new UserInput011();
			p.purchaseBike();
			
		}

	}

