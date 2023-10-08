package loopstatment;
import java.util.Scanner;
public class While_revrsevlaue {  // 123456-654321//one drawback this not revrse 0 number 
	int b =0;             //using while loop any reverse value to execute that is 12354 reverse-45321	                                    
	int num; 
	int a;//using scanner only declare to int num;
	public void m1()        //without scanner using declare to int num = 12345; like this
	                        // rev = rev*10+num%10; 
	{                       // num = num/10;
		
  	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number;");
	int num = scan.nextInt();                  //  0*10+1234%10= 4 rev  1st step     
	                                           //   1234/10=123  num 
	scan.close();                               // 4*10+123%10=40+3=43   2nd step   
       	                                         //  123/10=12
	             
		while(num!=0)                             //43*10+12%10=430+2=432  3rd step
		{  a = num%10;                                       //12/10=1
			b = b*10+a;                  //432*10+1/10=4320+1=4321  4th step
			num = num/10;                          //1/10=0 (false then loop stop)
		}	
		
		  System.out.println("reverse number is "+b);		
	}

  public static void main(String[] args)
  {
	  While_revrsevlaue v = new While_revrsevlaue();
	     v.m1();
  }
}
