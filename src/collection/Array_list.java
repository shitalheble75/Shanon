package collection;

import java.util.ArrayList;

public class Array_list {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Shital");
	al.add(55.8);
	al.add(null);
	al.add(null);
	al.add(6000);
	System.out.println(al);//print entire data
	System.out.println(al.size());//get the size
	System.out.println(al.isEmpty());//false
	System.out.println(al.contains(200));//false
	System.out.println(al.get(0));
	
	
}
}
