package list;

import java.util.*;

class Employee{
	int empNo;
	String empName;
	double empSalary;
	public Employee(int empNo, String empName, double empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
class SalarySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empSalary > o2.empSalary)
			return 1;
		else if(o1.empSalary < o2.empSalary)
			return -1;
		else
		return 0;
	}
}
//comparators
class NameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empName.compareTo(o2.empName) > 1)
			return 1;
		else if(o1.empName.compareTo(o2.empName) < 1)
			return -1;
		else
		return 0;
	}
	
}
public class EmployeeSort {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Java",35000);
		Employee e2 = new Employee(5,"Testing",15000);
		Employee e3 = new Employee(2,"Oracle",45000);
		Employee e4 = new Employee(4,"Pyhton",55000);
		Employee e5 = new Employee(3,"DotNet",25000);
		
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		for(Employee e:a)
			System.out.println(e);
		
		System.out.println("Sorting Employee objects based on Salary :");
		Collections.sort(a, new SalarySort());
		for(Employee e:a)
			System.out.println(e);
		
		System.out.println("Sorting Employee objects based on Name :");
		Collections.sort(a, new NameSort());
		for(Employee e:a)
			System.out.println(e);

	}

}
