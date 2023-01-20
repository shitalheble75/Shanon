package collection;

import java.util.HashSet;

public class Hash_set {
public static void main(String[] args) {
	HashSet b=new HashSet();
	b.add(null);
	b.add("Pallavi");
	b.add("shital");
	b.add("Pallavi");
	b.add("sarita");
	b.add("Revensiddh");
	b.add(9876);
	System.out.println(b);//duplicated not allowed
	System.out.println(b.size());
	System.out.println(b.contains(b));
	b.remove(2);
	System.out.println(b);	
}
}
