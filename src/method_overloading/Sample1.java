package method_overloading;

public class Sample1 {
	
	public static void m1(int a,int b,int c) {
		System.out.println("10,20,30");
		
	}
	public static void m1(int a,int b, int c, int d) {
		System.out.println("10,20,30,40");
		}
	public static void main(String[] args) {
		m1(10,20,30);
		m1(10,20,30,40);
	}
	}
