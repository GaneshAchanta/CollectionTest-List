package list;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cpp");
		list.add("Oracle");
		list.add("Html");
		list.add("Servlets");
		System.out.println("Initial list : "+list); //Initial list : [Java, Cpp, Oracle, Html, Servlets]
		list.add(2,"Testing");
		System.out.println("Initial list : "+list); //Initial list : [Java, Cpp, Testing, Oracle, Html, Servlets]
		list.remove(1);
		System.out.println("Initial list : "+list); //Initial list : [Java, Testing, Oracle, Html, Servlets]
	}

}
