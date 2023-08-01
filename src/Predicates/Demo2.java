package Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	
	String ename;
	int salary;
	int experience;
	
	Employee(String name, int sal, int exp) {  //constructor
		ename=name;
		salary=sal;
		experience= exp;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		//Example 1:
		Employee emp = new Employee("David", 10000, 5);
		
		
		//emp obj --> return name if sal>30k & exp>3
		Predicate<Employee> pr=e->(e.salary>30000 && e.experience>3); //Lamda expression
		
		System.out.println(pr.test(emp)); 
		
		
		//Example 2: 
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("David", 10000, 5));
		al.add(new Employee("Smith", 20000, 7));
		al.add(new Employee("Alexis", 56000, 3));
		al.add(new Employee("Scott", 65000, 9));
		al.add(new Employee("Lorraine", 85000, 6));
		al.add(new Employee("Soni", 15000, 8));
		al.add(new Employee("Tony", 63000, 7));
		al.add(new Employee("Muhammad", 96000, 4));
		
		for(Employee e:al) {
			
			if(pr.test(e)) {
				System.out.println(e.ename + "  " + e.salary);
			}
		}
	}

}













