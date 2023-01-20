package exception;

public class Number_formate {
	public static void main(String[] args) {
		try{
			Integer.parseInt("99A872");
	}
		catch( NumberFormatException r)  {
			System.out.println("No formate exception");
			System.out.println("Its handled successfully");
		}

	}
	}
