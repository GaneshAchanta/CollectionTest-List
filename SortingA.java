package list;
import java.util.*;

public class SortingA {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Java");
		a.add("Oracle");
		a.add("Python");
		a.add("Testing");
		a.add("DotNet");
		System.out.println("Before Sorting");
		for(String name:a)
			System.out.println(name);
		Collections.sort(a);//sort ArrayList elements in default sorting order (ascending order)
		System.out.println("After Sorting");
		for(String name:a)
			System.out.println(name);

	}

}
