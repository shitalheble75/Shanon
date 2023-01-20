package exception;

public class Null_pointer {
  int i=105;
  public static void main(String[] args) {
  try { 
	  NullPointerException r=null;
	  System.out.println(r);
  }
  catch(Throwable r) {
  System.out.println("Handled by exception mechanism");	
   }
  System.out.println("Hi");
  }
}
