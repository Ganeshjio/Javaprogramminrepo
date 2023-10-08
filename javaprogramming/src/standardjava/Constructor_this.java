package standardjava;

public class Constructor_this {

	//Declaration    //insatnce varibale
	String name;     //using this keyword 
	int rollno;
	float fee;

	//inilization
	Constructor_this(String name,int rollno,float fee)  //constructor
	{
		this.name=name;
		this.rollno=rollno;   
		this.fee=fee;

	}
 
	//usages
	public void dispaly()
	{
		System.out.println(name+"\n"+rollno+"\n"+fee);
	}

	public static void main(String[]args)
	{
		Constructor_this v = new Constructor_this("mk",25,2514);
		v.dispaly();
	}
}
