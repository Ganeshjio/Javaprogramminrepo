package alltablenumber;

import java.util.Scanner;

public class Table_num2 {
	
	public static void main(String[]args)
	{                          
		                       //i=1;   //scanner
		int i=1;
		int j=1;
		int a=0; 
		System.out.println("enter number");
		Scanner s1 = new Scanner(System.in);
		i = s1.nextInt();
		j=i;
		
		  //inilization  for(int i=1;i<=5;i++)  //other using for loop
		                         //System.out.println("2 * " + i +" "+2 * i);

		while(a<10)  //condition  //2 4 6--20
		{
			System.out.println(i);  //2 4 6 8 10---20
			i+=j;                   // i=i+2;  == i+2 both are same    2 4 6 ----22(then false)
			a++;                      //standard increment varible+=num;
			                      //this is use short hand opertor//assigning opertor
		}                          //same table right but only change number: i=4; and condition same and
	}                               //i+=4; (4 number table)
                                    //also right odd number only change inilization change(i=1)
}
