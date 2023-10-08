package controlflow;
import java.util.Scanner;
public class Mock_arm {

	public void m1()
	{                              //r=153%10= 3,5,1
	  int num =153;            //b=27+125+1=153
		int a;                    //n=153/10=15,3,0
		int b=0;
		int c;
		

		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		num=scan. nextInt();
		scan.close();

		a=num;

		while(num>0)
		{
			c=num%10;
			b=b+(c*c*c);
			num=num/10;
		}

		if(a==b)
		{
			System.out.println("this is armstrong number");	
		}
		else
		{
			System.out.println("this is not armstrong number");	
		}
	}

	public static void main(String[]args)
	{
		Mock_arm v = new Mock_arm();
		v.m1();
	}

}
