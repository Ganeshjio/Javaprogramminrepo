package loopstatment;

public class Reversenumber2 {

	public void m1()

	{
		int n = 123;
		int d =0;
		int w;
		while (n>0) {
			w = n%10;// 3, 2, 1
			d = (d*10)+w;// 0 + 3, 32, 321
			n = n/10;// 12, 1, 0
		}

		System.out.println(d);
	}


	public static void main(String[] args)

	{
		Reversenumber2 v = new Reversenumber2();
		v.m1();
	}
}
