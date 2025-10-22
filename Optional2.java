package week3;

import java.util.List;
import java.util.Optional;

class Employee2 {
    String name;
    String department; 

    Employee2(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    public String getname() {
    	return name;
    }
    public Optional<String> getdept() {
    	return Optional.ofNullable(department);
    }
    
    public String toString(){
    	
		return name + " : " + getdept().orElse("no department");
				
    	
    }
}
    
public class Optional2 {

	public static void main(String[] args) {
		
        List<Employee2> employees = List.of(
                new Employee2("Alice", null),
                new Employee2("Bob", null),
                new Employee2("Charlie", "IT")
            );
        
        System.out.println(employees);
        
        String finalname =employees.stream()
        		.filter(x-> x.getdept().map(d-> d.equals("IT")).orElse(false) )
        		.map(x-> x.getname())
        		.findFirst()
        		.orElse("no it employees");
        				
        
        System.out.println(finalname);
        		
        		

}
}