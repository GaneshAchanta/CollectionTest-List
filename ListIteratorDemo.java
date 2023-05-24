package list;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Java");
		a.add("Oracle");
		a.add("Python");
		a.add("Testing");
		a.add(".Net");
		System.out.println(a);
		
		ListIterator<String> l = a.listIterator();//creation of ListIterator object
		System.out.println("Forward Direction");
		while(l.hasNext())
			System.out.println(l.next());
		
		System.out.println("Backward Direction");
		while(l.hasPrevious())
			System.out.println(l.previous());
		
	}

}
