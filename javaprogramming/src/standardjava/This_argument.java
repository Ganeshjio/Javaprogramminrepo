package standardjava;

public class This_argument {
	// Deceleration
	// Datatypes variable name;
	// Instance variable
	// Data members of class

	String x;
	String y;
	String z;
	

//Initilzation - the object/instance/ data member of a class
//create constructor - Classname(arguments define ){}
//variable name = info/data/local variable name(argument name)

This_argument(String x, String y, String z){
	this.x = x;
	this.y = y;
	this.z = z;
}
	
	// Usage
	// non static method -- printing statement --
	// same for different objects
	
	public void nonsaticmehod() {
	System.out.println("this is x ="+x);
	System.out.println("this is y ="+y);
	System.out.println("this is z ="+z);
			
	}
	// Calling everytbing in Main method
	// creating the constructor--object initilize-
	// Classname Reference Variable
	
	public static void main(String[] args) {
		This_argument v = new  This_argument("aaj matche", "hai kaya", "india vs pakistan");
		v.nonsaticmehod();
	
			
		
	}
	

}