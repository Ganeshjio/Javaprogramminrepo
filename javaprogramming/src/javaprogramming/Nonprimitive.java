package javaprogramming;

public class Nonprimitive {

	public static void w1(){
		int a = 400;
		System.out.println(a);
	}

	public void w2() {
		long d = 300;
		System.out.println(d);

	}

	public void w3() {

	}

	public static void main(String[] args) {
		w1();
		Nonprimitive v = new Nonprimitive();
		v.w2();
		int a = 200;
		long d = 550;
		System.out.println(a);
		System.out.println(d);

	}

}
