package week3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Product10 {
    String name;
    Integer price;      // can be null
    Integer discount;   // can be null

    Product10(String name, Integer price, Integer discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() { return name; }
    
    public Optional<Integer> getPrice()
    { 
    	return Optional.ofNullable(price); }
    
    public Optional<Integer> getDiscount()
    
    { return Optional.ofNullable(discount);
    }

    public String toString() {
        return name + " : " + getPrice().orElse(0) + " : " + getDiscount().orElse(0);
    }
}


public class Optional5 {
	
	public static void main(String[] args) {
	
	List<Product10> products = List.of(
		    new Product10("Laptop", 1200, 10),
		    new Product10("Phone", null, 5),
		    new Product10("Tablet", 80, null),
		    new Product10("Headphones", 150, 15),
		    new Product10("Camera", 1500, 20)
		);
	
	System.out.println(products);
	
	String pname= products.stream() // first product whose discount > 15
	.filter(x-> x.getDiscount().map(p-> p>15).orElse(false))
	.map(x->x.getName())
	.findFirst()
	.orElse("no product having discount greater than 15");
	

	System.out.println(pname);
	
	Integer minprice=products.stream()  //Get the price of the first product over 1000, or return 0 if none exists.
	.filter(x -> x.getPrice().map(t->t>1000).orElse(false))
	.sorted((a,b)-> a.getPrice().get() - b.getPrice().get())
	.map(p->p.getPrice().get())
	.findFirst()
	.orElse(0);
	
	System.out.println(minprice);
	
	Integer maxi=products.stream()   //Find the maximum discount among all products.
	.map(p-> p.getDiscount().orElse(0))
	.max((a,b) -> a-b)
	.orElse(0);
	System.out.println(maxi);
	
	
	products.stream() //Check if any product has a price less than 200.
	.filter(x->x.getPrice().map(p->p<200).orElse(false))
	.map(l-> l.getName())
	.forEach(System.out::println);
	
	
	Integer pricediscount=products.stream()//Print the price of the product with the maximum discount
	.max((a,b)-> a.getDiscount().orElse(0) - b.getDiscount().orElse(0))
	.map(p -> p.getPrice().orElse(0)).orElse(0);

	System.out.println(pricediscount);
	
	
}}
