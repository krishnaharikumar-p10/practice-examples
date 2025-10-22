package week3;

import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface PersonMapper{
	String extractname(Person p);
}

class Person{
	
	private String name;
	private int age;
	private int salary;

	Person(String name, int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Name: " +getName()+", Age: "+getAge()+", Salary: "+getSalary();
		
	}	
}


public class Lambdaexample {

	public static void main(String[] args) {
		
		List<Person> person= new ArrayList<>();
		
		person.add(new Person("Jo",48,500000));
		person.add(new Person("Taylor",70,9005000));
		person.add(new Person("Maya",24,8000000));
		
		for(Person obj : person) {
			System.out.println(obj);

		}
		
		Predicate<Integer> filterpeople = n-> n>25;
		
		List<Person> filteredlist= new ArrayList<>();
		
		for(Person obj: person) {
			if (filterpeople.test(obj.getAge())) {
				filteredlist.add(obj);
			}
		}
		
		System.out.println("AFTER FILTERING");
		for(Person obj : filteredlist) {
			System.out.println(obj);

		}
		
		System.out.println("AFTER SORTING");
		Comparator<Person> comp= (Person obj1,Person obj2) -> (obj1.getAge()-obj2.getAge())*-1;
		Collections.sort(filteredlist,comp);
		
		for(Person obj : filteredlist) {
			System.out.println(obj);

		}
		
		
		PersonMapper pm=(Person p) -> p.getName();
		
		List<String> namelist= new ArrayList<>();
		
		for ( Person obj: filteredlist) {
			namelist.add(pm.extractname(obj));
		}
		
		System.out.println("NameList : " +namelist);
		
		
		Consumer<String> upper =s -> System.out.println(s.toUpperCase());
		
		for(String name: namelist) {
			upper.accept(name);
		}
	}

}
