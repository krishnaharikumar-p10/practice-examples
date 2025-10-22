package week3;

import java.util.List;
import java.util.Optional;

class Employee1 {
    String name;
    Integer age;
    String department;

    Employee1(String name, Integer age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() { return name; }
    public Integer getAge() { return age; }
    public String getDepartment() { return department; }

    public String toString() {
        return name + " : " + age + " : " + department ;
    }
}

public class OptionalExample1 {

	public static void main(String[] args) {
		List<Employee1> employees = List.of(
			    new Employee1("Alice", 25, null),
			    new Employee1("Bob", 20, "IT"),
			    new Employee1("Charlie", 30, "HR"),
			    new Employee1("David", 22, "IT"),
			    new Employee1("Eve", null, "IT")
			);

	Optional<Employee1> youngest=	employees.stream()
		.filter(s-> s.getAge()!=null &&  s.getAge()>=18 && s.getDepartment()!=null)
		.filter(s-> s.getDepartment()=="IT")
		.sorted((a,b) -> a.getAge() -b.getAge())
		.findFirst();
		
	
	System.out.println(youngest);
	
     String youngestname = youngest
    		 .map(s-> s.getName())
    		 .orElse("No adult employee found in IT");
     
     System.out.println(youngestname);
		
	
		
		
	}

}
