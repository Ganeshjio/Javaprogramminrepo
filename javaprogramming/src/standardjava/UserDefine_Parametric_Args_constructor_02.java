package standardjava;

public class UserDefine_Parametric_Args_constructor_02 {
	String x;
    String Y;
    long z;
    
    // argument constructor
    
    UserDefine_Parametric_Args_constructor_02(String x1, String y1, long z1){
    	x = x1;
    	Y = y1;
    	z = z1;
    	
    }
    
    public void m2()
    {
    	System.out.println("x="+x + "\n"+ "y="+Y +  "\n"+"z="+z);
    	
    	
    }
    public static void main(String[] args) {
    UserDefine_Parametric_Args_constructor_02 v = new UserDefine_Parametric_Args_constructor_02("hello to every one", "my name is ganesh",9890458920l);
    v.m2();
    }
}
