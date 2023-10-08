package controlflow;

public class Elseifconditionstatement {
	// If Else If /Else If / ElseIfLadderStatements
		public  void m1() {
			
			int marks = 65;
			
			if (marks >=65 && marks <=100) {
				System.out.println("First Class with Ditinction");
			}
			else if(marks>=60 && marks <65) {
				System.out.println("First Class");
			}
			else if(marks>=55 && marks <60) {
				System.out.println("Higher Second Class");
			}
			
			else {
				System.out.println("i am very nervous");
			}
			
		}
	

       public static void main(String[] args) {
	   Elseifconditionstatement v = new Elseifconditionstatement();
	     v.m1();
   }
}