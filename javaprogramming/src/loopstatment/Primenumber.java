package loopstatment;

public class Primenumber {


	// Check number is prime or not 
	// Logic - if the number is divisible by only by 1 and itself 
	// and not divisible by any other number
	public void m1()
	{

		int n = 27;
		int s = 0;
		int i = 0;
		int a = 0;

		for (i=2; i<n; i++) {    // 2 (3), 3(4), 4 (5)
			s =n%i;// 5%2 = 1, 5%3=2, 5%4=1
			if (s==0) {// false
				System.out.println(n + " is not prime number");
				a = a+1;
				break;
			}
		}
		if (a==0) {
			System.out.println(n + " is prime number");
		}

	}

	public static void main(String[] args) {

		Primenumber v = new Primenumber();
		v.m1();
	}

}








