package collection;

import java.util.TreeSet;

public class Treaset {
public static void main(String[] args) {
	TreeSet tr=new TreeSet();
	tr.add(6.5);
	tr.add(5.5);
	tr.add(2.5);
	tr.add(3.0);
	tr.add(0.8);
	System.out.println(tr);
	System.out.println(tr.size());
	System.out.println(tr.isEmpty());
	tr.remove(0.8);
	System.out.println(tr);
}
}
