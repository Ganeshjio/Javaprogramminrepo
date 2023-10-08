package loopstatment;

import java.util.Scanner;

public class Fibonacciseries {

	int a=0;
	int b=1;                            
	int num;                              //0 1 1 2 3 5 8 and so on;
	int c;                              //this series start with 0 no. 

	public void m1()

	{

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		 num= scan.nextInt();
		scan.close();

		
			for(int i=1;i<=num;i++)
			{
				System.out.print(" "+a);
				c=a+b;
				a=b;
				b=c;
			}
		}

	
	public static void main(String[] args)

	{
		Fibonacciseries v = new Fibonacciseries();
		v.m1();

	}
}
