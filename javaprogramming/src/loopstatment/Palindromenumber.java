package loopstatment;
import java.util.Scanner;
public class Palindromenumber {     //for ex =212
	int n;                         //p=212%10=2/1/2
	int p;                         //q=(q*10)+p=2/21/212    //212,535,121
	int q=0;                       //n=n/10=21/2/0 
	int c= n;

	public void m1()

	{
		System.out.println("enter number");
		Scanner scan = new Scanner(System.in);
		n = scan .nextInt();
		scan.close();

		int c=n;
		while(n>0)
		{
			p=n%10;
			q=(q*10)+p;
			n=n/10;	
		}
		if(c==q)
		{
			System.out.print("you have printed palindrome number");
		}
		
		else {

			System.out.print("you have not printed palindrome number");

		}
	}

	public static void main(String[] args)

	{
		Palindromenumber v = new Palindromenumber();
		v.m1();

	}
}

















