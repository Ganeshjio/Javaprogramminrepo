package loopstatment;

public class Avergenumber {

	public void m1()        
	{
		int a=10;
		int b=1023;
		int c=102022;
		int d=999;
		int e=0;                             //avg=sum of values/number of values
                                            //double data type to use because avg result also point value
		int sum  = a+b+c+d+e;
		System.out.println("toatl marks ="  +  sum);

		double avg=sum /5.0;
		System.out.println("averge marks ="  +  avg);
	}
	public static void main(String[] args)
	{
		Avergenumber v = new Avergenumber();
		v.m1();

	}

}
