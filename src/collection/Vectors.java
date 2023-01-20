package collection;

import java.util.Vector;

public class Vectors {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("samantha");
	v.add(10.3);
	v.add(9068084883l);
	v.add('A');
	v.add("kishori");
	v.add(6890);
	v.add("false");
	v.add("lion");
    v.add("velocity");
    System.out.println(v);
    System.out.println(v.size());
    System.out.println(v.isEmpty());
    System.out.println(v.contains(v));
    System.out.println(v.capacity());
    System.out.println(v.get(4));
    v.add(4,8765);
    System.out.println(v);
    v.remove(3);
    System.out.println(v);
}
}
