package standardjava;

public class Argument03 {
	//Declaration
	String name;     //because printing statement is non static method this value taken from instance varible is access only non static method)
	int rollno;    //instance variable
	float fee;

	Argument03(String name,int rollno,float fee)
	{
		name=name;
		rollno=rollno;    //local variable
		fee=fee;          //constructor
	}

	public void display()    //non static method
	{
		System.out.println(name+"\n "+rollno+"\n "+fee);
	}

	public static void main(String[]args)
	{
		Argument03 v = new Argument03("ganesh",25,42);
		v.display();		
	}
}
