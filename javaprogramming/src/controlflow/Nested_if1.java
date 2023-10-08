package controlflow;

public class Nested_if1 {
	
	 //using Nested_if 
    //In Two statement usin nested if inner if is true then execute inner stat only print
   //Inneer if and outer if is true then both statement is print
  //But inner if is false and outer if is true then execute for else statemnt 
	
	public void m1()
	{
		int age = 17;      
		int weight = 60;  
		                  
		if(age>=18) //inner if
		{
			System.out.println("eligibale for vote and blood");
			
			if(weight>50)//outer if
			{
				System.out.println("eligibale for donate  blood");
			}
		}
		
		else
		{
			System.out.println("not eligibale for vote");
		}
		
	}
	public static void main(String[]args)
	{
		Nested_if1 v = new Nested_if1();
		v.m1();
	}

}
