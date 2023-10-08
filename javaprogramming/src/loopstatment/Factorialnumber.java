package loopstatment;

import java.util.Scanner;

public class Factorialnumber {


	public void m1()
	{
		//mathematical operation of multiplying a no. with all the smaller no.
		//ex:6!=6*5*4*3*2*1=720
		double num;
		double p =1;
		System.out.println("enter number");
		Scanner s1 = new Scanner(System.in);
		num = s1.nextInt();

		for(double i=1;i<=num;i++) // 1(2) 2(3) 3(4) 4(5) 5(6)(false)
		{
			p = p*i;                          //1*2*3*4*5=120
			System.out.println(" value =" +p);
		}

		System.out.println("Factorial Number=" +p);
	}


	public static void main(String[] args)
	{
		Factorialnumber v = new Factorialnumber();
		v.m1();
	}
}
