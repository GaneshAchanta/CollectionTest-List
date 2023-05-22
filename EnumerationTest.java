package list;

import java.util.*;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println(v1);
		
		//retrieve vector by using enumeration
		v1.elements();
		Enumeration<Integer> e = v1.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

	}

}
