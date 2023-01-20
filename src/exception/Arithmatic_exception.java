package exception;

public class Arithmatic_exception {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		try {
			int c=a/b;
		}
	catch(Throwable monkey)  {
		System.out.println("Hey nw its handled");
	}
		System.out.println("shitz");
	}
}