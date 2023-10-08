package standardjava;

public class Constructor_this1 {
	//Declaration
	String name;   //instance varibale
	int id;        //to using one class create multiple object is possibal 
	float fee;     //short data type is not allowed in constrouctro(to use only 4=> byte)
	
   //inilization
	Constructor_this1(String name,int id,float fee)
	{
		this.name=name;
		this.id=id;
		this.fee=fee;
	}
	
	//usges
	public void display()
	{
		System.out.println(name+"\n"+id+"\n"+fee);
	}
	
	public static void main(String[]args)
	{ 
		Constructor_this1 v = new Constructor_this1("arjun",1225,55);
		Constructor_this1 p = new Constructor_this1("rahul",125,44);
		Constructor_this1 k = new Constructor_this1("rohit",145,57);
		v.display();
		p.display();
		k.display();
	}
}
