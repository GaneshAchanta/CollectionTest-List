package list;

import java.util.*;

public class ArrayListData {

	public static void main(String[] args) {
		List<String>programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		
		System.out.println("Initial list :"+programmingLanguages);
		
		programmingLanguages.add(2,".Net");
		System.out.println("List after adding element at index 2 :"+programmingLanguages);
		
		//remove element kotlin based on index (List method)
		String s = programmingLanguages.remove(3);
		System.out.println("After "+s+" Element is removed then the List is ="+programmingLanguages);
		//remove element Perl based on value (Collection method)
		boolean b = programmingLanguages.remove("Java");
			if(b)
				System.out.println("Element is removed from List");
			else
				System.out.println("Element is not Removed from List");

	}

}
