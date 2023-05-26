package list;
import java.util.*;

public class RetrieveList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("core java");
		a.add("advanced java");
		a.add("hibernate");
		a.add("spring");
		a.add("project");
		System.out.println("List contains :"+a);
		
		System.out.println("Retrieve List elememts by using Basic for loop");
			for(int i=0; i<a.size(); i++) {
				System.out.println(a.get(i));
			}

		System.out.println("Retrieve List elements by using enhanced for loop");
			for(String s:a)
			{
				System.out.println(s);
			}
			
		System.out.println("Retrieve List elements by using While loop");
			int x=0;
			while (a.size() > x) {
				System.out.println(a.get(x));
				x++;
			}
		
		
	}

}
