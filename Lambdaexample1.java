package week3;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface StudentName{
	String name(Student s);
}

@FunctionalInterface
interface StudentMark{
	void filtering(Student stu);
}

class Student{
	String name;
	int age;
	int marks;
	
	Student(String name, int age, int marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public String toString() {
		return "Name: "+ name+ ", Age: "+ age+ ", Marks: "+marks;
		
	}
}

public class Lambdaexample1 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Jo",20,90));
		students.add(new Student("Taylor",15,50));
		students.add(new Student("Alex",18,85));
		
		
		for( Student obj: students) {
			System.out.println(obj);
		}
		
		System.out.println();

		System.out.println("AFTER FILTERING USING FUNCATIONAL INTERFACE ");

		List<Student> filteredinterfacestudents = new ArrayList<>();
		StudentMark inter= (Student stu) -> {
			if(stu.marks >=70) {
				filteredinterfacestudents.add(stu);
			}
		};
		
		for( Student item: students) {
			inter.filtering(item);
		}

		for( Student obj1:  filteredinterfacestudents) {
			System.out.println(obj1);
		}
	
		
		System.out.println();

		System.out.println("AFTER FILTERING USING PREDICATE ");
		
		Predicate<Integer> filtermark= m-> m>=70;
		
		List<Student> filteredstudents = new ArrayList<>();
		
		for(Student obj: students) {
			if (filtermark.test(obj.marks)) {
				filteredstudents.add(obj);
			}
		}
		
		for( Student item:  filteredstudents) {
			System.out.println(item);
		}
		
		System.out.println();
		System.out.println("AFTER SORTING ");
		Comparator<Student> comp = (Student s1,Student s2) -> s1.marks-s2.marks;
		Collections.sort(filteredstudents,comp);
		
		for( Student item:  filteredstudents) {
			System.out.println(item);
		}
		
		System.out.println();
		System.out.println("GRADES OF THE STUDENTS ");
		List<String> marktograde = new ArrayList<>();
		
		Function<Student,String> convertmarktograde=object->
		{
			int mk=object.marks;
			if(mk>=90) return "A+";
			else if (mk >=80 && mk<90) return "A";
			return "B";
		};
		
		for( Student item:  filteredstudents) {
			System.out.println("Name: "+ item.name +", Grade: "+ convertmarktograde.apply(item) );
		}
		
		System.out.println();
		System.out.println("NAMES OF THE STUDENTS");
		List<String> names = new ArrayList<>();
		
		StudentName sn= (Student s) -> s.name;
		
		for( Student item:  filteredstudents) {
			names.add(sn.name(item));
		}
		System.out.println(names);
		
		System.out.println();
		System.out.println("UPPERCASE NAMES ");
		Consumer<String> upper= (s)-> System.out.println(s.toUpperCase());
		for(String str:names  ) {
			upper.accept(str);
		}
	}
	
	

}
