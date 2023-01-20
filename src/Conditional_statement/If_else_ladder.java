package Conditional_statement;

public class If_else_ladder {
	public static void main(String[] args) {
		int marks=95;
		if(marks>=80) {
			System.out.println("pass with distinction");
		}
		else if(marks>=60)  {
		System.out.println("pass with first class");
	}
		else if(marks>=50)  {
			System.out.println("pass in 2nd class");	
		}
		else if(marks>=40) {
			System.out.println("pass with third class");
		}
		else {
			System.out.println("fail");
		}
}
	
}		
