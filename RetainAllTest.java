package list;
import java.util.*;

public class RetainAllTest {

	public static void main(String[] args) {
		// Creation of an ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("four");
		a1.add("five");
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("one");
		a2.add("two");
		a2.add("three");
		//retainAll() method removes 
		//a1.retainAll(a2);
		//System.out.println(a2); //one,two,three
		
		//working with removeAll() method
		//removeAll() method removes common elements
		a1.removeAll(a2);
		System.out.println(a1);//four,five
	}

}
