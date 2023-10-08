package loopstatment;

import java.util.Scanner;     //using scanner to print enter num bet 1100-1900
                              //by using nestedif; ex 1299 this is odd number
public class Forloop01 {
	
	 int k;
	 
	 public  void m1() {
		 
		 System.out.println("enter a number between 1100 to 1900");
		Scanner scan = new Scanner(System.in);
		k = scan.nextInt();
		scan.close();
		
			if(k>=1100 && k<=1900) 

			{
				if((k%2)==0)

				{

				System.out.println("You have printed  Even Number ");

				}

				else if(k%2!=0)

				{
					System.out.println("You have printed odd Number ");

				}
			}

			else

			{
				System.out.println("You Have Entered Invalid Number");

			}
		}
	 
	public static void main(String[] args)
	{  
		
		Forloop01 v = new Forloop01();     //if(number%2==0)
		 v.m1();
	
}
	
}