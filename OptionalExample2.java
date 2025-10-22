package week3;

import java.util.List;
import java.util.Optional;

class Customer {
    String name;
    Integer age;

    Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public Integer getAge() { return age; }
    
    public String toString() {
		return name +" : "+ age;
    }
}

public class OptionalExample2 {

	public static void main(String[] args) {
		
	
		List<Customer> customers = List.of(
			    new Customer("Alice", 10),
			    new Customer("Bob", null),
			    new Customer("Charlie", 10),
			    new Customer("David", 15)
			);

		
		String custname = customers.stream()
				.filter(c-> c.getAge()!=null)
				.filter(c-> c.getAge()>=18)
				.findFirst()
				.map(c-> c.getName())
				.orElse("No adult customer found");
				
				
		System.out.println(custname); // first adult customer
		
	}

}
