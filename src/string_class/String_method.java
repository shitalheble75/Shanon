package string_class;

public class String_method {
public static void main(String[] args) {
	 String k1= "yashodhara";
	 String k2="YASHODHARA";
	 String k3="dhara";
	  //length()
	 System.out.println(k1.length());
	 System.out.println(k1.toUpperCase());
	 System.out.println(k1.toLowerCase());
	 System.out.println(k1.equals(k2));
	 System.out.println(k1.contains(k3));
	 System.out.println(k2.contains(k3));
	 System.out.println(k2.charAt(3));
	 System.out.println(k1.indexOf('d'));
	 System.out.println(k1.concat(k3));
	 System.out.println(k2.substring(4));
	 System.out.println(k1.startsWith("ya"));
	 System.out.println(k2.endsWith("RA"));
} 
}
