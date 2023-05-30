package list;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,4);
		System.out.println("Capacity :"+v.capacity());
		System.out.println("Size :"+v.size());
		v.add("Java");
		v.add("Oracle");
		System.out.println("Capacity :"+v.capacity());
		System.out.println("Size :"+v.size());
		v.add("Testing");
		System.out.println("Capacity :"+v.capacity());
		System.out.println("Size :"+v.size());

	}

}
