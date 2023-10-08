package standardjava;

public class UserDefine_Non_Args_constructor_01 {
	
	String x;
	String y;
	int z;
	
	UserDefine_Non_Args_constructor_01()
	{
		x = "my name is ganesh";
		y = "i like movie";
		z = 431123;
				
	}
       public void m1() {
    	System.out.println(x);
    	System.out.println(y);
    	System.out.println(z);
       }
	
      public static void main(String[] args) {
      UserDefine_Non_Args_constructor_01 v = new UserDefine_Non_Args_constructor_01();
      v.m1();
    	  
      }
}
