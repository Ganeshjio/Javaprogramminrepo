package loopstatment;

import java.util.Scanner;

public class Armstrongloopnumber {

	int num=1634;                  // ex. r=1634%10=4//163%10=3//16%10=6//1%10=1 (remaining value )                       
	int a;                       //b=256,256+81=337,1296+337=1633,1+1633=1634 (this number addition)
	int b=0;                       //n/10=163,16,1,0  (use condition check compare to 0)
	int c;                             

	public void m1()

	{
		Scanner scan = new Scanner(System.in);           // 153=1+125+27=153//1634=1+1296+81+256
		System.out.println("enter any number");
		num = scan.nextInt();
		scan.close();
		

		a=num;
		while(num>0)
		{
			c=num%10;
			b=b+(c*c*c*c);
			num=num/10;
		}

		if (a==b)
		{
			System.out.println("this is armstrong number");
		}

		else 

		{
			System.out.println("this is a not armstrong number");

		}
	}
	public static void main(String[] args)
	{
		Armstrongloopnumber v = new Armstrongloopnumber();
		v.m1();
	}


}
