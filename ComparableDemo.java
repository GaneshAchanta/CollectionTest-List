package list;
import java.util.*;

class StudentA implements Comparable<StudentA>{
	int regNo;
	String name;
	int marks;
	public StudentA (int regNo, String name, int marks) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(StudentA o) {
		if(this.name.compareTo(o.name) <1) //descending order
			return 1;
		else if(this.name.compareTo(o.name) >1)
			return -1;
		else
			return 0;
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		StudentA s1 = new StudentA(1,"Java",89);
		StudentA s2 = new StudentA(4,"Oracle",79);
		StudentA s3 = new StudentA(2,"Testing",81);
		StudentA s4 = new StudentA(3,"Python",69);
		StudentA s5 = new StudentA(5,"DotNet",85);
		ArrayList<StudentA> a = new ArrayList<StudentA>(); //ArrayList with user defined generic
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		for(StudentA s:a)
			System.out.println(s);
		Collections.sort(a);
		System.out.println("After Sorting");
		for(StudentA s:a)
			System.out.println(s);

	}

}
