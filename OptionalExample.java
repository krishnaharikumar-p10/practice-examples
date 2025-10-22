package week3;

import java.util.Optional;

class User {
    String name;
    Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public Integer getAge() { return age; }
    
    public String toString() {
		return name +" : "+ age;
    	
    }
}


public class OptionalExample {

	public static void main(String[] args) {

		Optional<User> optional= getUserById(2);
		
		//System.out.println(optional);
		
		//if (optional.isPresent()) {
		//	int a= optional.get().age;
		//	System.out.println(a);
		//}else {
			//System.out.println("User not found");
		//}
		
		
		String message= optional
				.map(x-> x.getAge())
				.map(x-> String.valueOf(x))
				.orElseGet(()->
				{
					if(optional.isPresent()) return "age unknown";
					else return "User Not Found";
				});
		
		System.out.println(message);
	
	}
	public static Optional<User> getUserById(int id) {
	    if (id == 1) return Optional.of(new User("Ram", 25));
	    if (id == 2) return Optional.of(new User("Shyam", 30));
	    return Optional.empty(); // user not found
	}

	
	
}
