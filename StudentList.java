package list;
import java.util.*;

class Student{
	int regNo;
	String name;
	int marks;
	public Student(int regNo, String name, int marks) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

public class StudentList {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Java",89);
		Student s2 = new Student(4,"Oracle",79);
		Student s3 = new Student(2,"Testing",81);
		Student s4 = new Student(3,"Python",69);
		Student s5 = new Student(5,"DotNet",85);
		ArrayList<Student> a = new ArrayList<Student>(); //ArrayList with user defined generic
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		for(Student s:a)
			System.out.println(s);

	}

}
