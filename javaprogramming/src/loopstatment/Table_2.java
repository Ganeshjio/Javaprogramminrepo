package loopstatment;

public class Table_2 {
	                          //table no 2 and 3 for using loop
	int i;

	public void m1()
	{
		
		for(int i=1;i<=5;i++)  
		{
			System.out.println("2 * " + i +" "+2 * i);
		
		}
		
		for(int i=1;i<=10;i++)  
		{
			System.out.println("3 * " + i +" "+3 * i);
		}
	
	}
	
	public static void main(String[]args)
	{
		Table_2 v = new Table_2();
		v.m1();
	}
}
