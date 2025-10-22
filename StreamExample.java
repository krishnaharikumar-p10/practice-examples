package week3;

import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	String dept;
	int salary;
	
	Employee(String name,String dept,int salary){
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		}
	
	public String toString() {
		return "Name: "+ name+ ", Department: "+ dept +", salary: "+salary;
		
	}
		
	
}

public class StreamExample {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Arjun", "IT", 60000));
		list.add(new Employee("Meera", "IT", 45000));
		list.add(new Employee("Rahul", "Finance", 70000));
		list.add(new Employee("Sneha", "IT", 75000));
		list.add(new Employee("Vikram", "HR", 500000));
		
		for (Employee emp:list) {
			System.out.println(emp);
		}
		System.out.println();
		System.out.println("IT EMPLOYEES");
		List<Employee> itemployee= list.stream()
				.filter(s -> s.dept=="IT")
				.toList();
		
		itemployee.forEach(s ->System.out.println(s));
		
		System.out.println();
		System.out.println("SORTED BY SALARY");
		List<Employee> sortedlist= itemployee.stream()
				.sorted((s1,s2) -> s1.salary -s2.salary)
				.toList();
		
		
		sortedlist.forEach(s -> System.out.println(s));
		
		List<String> upper =sortedlist.stream()
				.map( s-> s.name.toUpperCase())
				.toList();
		
		System.out.println();
		System.out.println(upper);
		
		System.out.println("\n\n");
		
		List<String> emp =list.stream()
				.filter(s -> s.dept=="IT")
				.sorted((s1,s2) -> s1.salary - s2.salary)
				.map(s -> s.name.toUpperCase())
				.toList();
		
		System.out.println(emp);
	}
	

}
