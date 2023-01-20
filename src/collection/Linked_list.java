package collection;

import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add('k');
		l.add("sarita");
		l.add(null);
		l.add("Revensiddh");
		l.add("heble");
		l.add(5);
		System.out.println(l);
		System.out.println(l.contains(null));
		System.out.println(l.size());
		System.out.println(l.get(4));
		System.out.println(l.isEmpty());
	l.add(1,"sam");
		l.remove(3);
		System.out.println(l);
	}

}
