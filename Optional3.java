package week3;

import java.util.List;
import java.util.Optional;

class Product2 {
    String name;
    Integer discount; // can be null

    Product2(String name, Integer discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() { return name; }
    
    public Optional<Integer> getDiscount() {
        return Optional.ofNullable(discount);
    }

    public String toString() {
        return name + " : " + getDiscount().orElse(0) ;
    }
}

public class Optional3 {

	public static void main(String[] args) {
	       List<Product2> products = List.of(
	               new Product2("Laptop", 10),
	               new Product2("Phone", null),
	               new Product2("Tablet", 19),
	               new Product2("Headphones", 9)
	           );
	       
	       Integer first=products.stream()
	       .filter(x-> x.getDiscount().map(d-> d>20).orElse(false)) 
	       .map(p-> p.getDiscount().get()) // bcoz filter already removed null 
	       .findFirst()
	       .orElse(0);
	       
	       System.out.println(first);

	}

}
