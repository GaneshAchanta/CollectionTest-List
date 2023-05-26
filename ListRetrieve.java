package list;

import java.util.*;

public class ListRetrieve {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cpp");
		list.add("Oracle");
		list.add("Html");
		list.add("Servlets");
		System.out.println("Initial list : "+list);
		System.out.println("******Iterator******");
		Iterator<String>  i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("******ListIterator Forward******");
		ListIterator<String> l = list.listIterator();
		while(l.hasNext())
			System.out.println(l.next());
		System.out.println("******ListIterator Backward******");
		while(l.hasPrevious())
			System.out.println(l.previous());

	}

}
