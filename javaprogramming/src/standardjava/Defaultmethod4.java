package standardjava;

public class Defaultmethod4 {

	
	// Declaration              // standform porgram
		String FullName;// 
		long MobNo; //
		long AadharNo;
		String Dob;
		boolean vaccinated;

		// Initialization                       
		Defaultmethod4 (String FullName1, long MobNo1, long AadharNo1, String Dob1, boolean vaccinated1){
			FullName = FullName1;
			MobNo = MobNo1;
			AadharNo = AadharNo1;
			Dob = Dob1;
			vaccinated = vaccinated1;
		}

		//Usage
		public void printForm() {
			System.out.println("---Corona Details 2022-2023---");
			System.out.println("  ---Government of India---  ");
			System.out.println("[1] Full Name is = " + FullName); 
			System.out.println("[2] Mobile Number is = " + MobNo);
			System.out.println("[3] Date of Birth is = " + Dob);
			System.out.println("[4] Are you Vaccinated? = " + vaccinated);
		}

		public static void main(String[] args) {
			Defaultmethod4 karan = new Defaultmethod4("karan joshi", 9993459848L, 23545678912L, "06th dec 1978", true);
			karan.printForm();
			Defaultmethod4 kiran = new Defaultmethod4("kiran mane", 8831830049L, 54825874132L, "14th jan 1998", true);
			kiran.printForm();
		}
	}
