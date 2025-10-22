package week3;

import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return "Name : "+ name + ", Price : "+price + ",Stock : "+stock;
    }
}

public class StreamExample2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(); 
        
        products.add(new Product("Laptop", 1200, 5));
        products.add(new Product("Mouse", 25, 0));
        products.add(new Product("Keyboard", 80, 10));
        products.add(new Product("Monitor", 200, 3));
        
        
        products.stream()
        .filter(s-> s.stock> 0)
        .sorted((s1,s2) -> Double.compare(s1.price,s2.price))
        .map(s->{
        	double discountprice;
        	if( s.price>100) discountprice= s.price * 0.95;
        	else discountprice= s.price;
        	return s.name + " - " + discountprice;
        })
        .forEach(System.out:: println);
        
        System.out.println("\n\n");
        
        List<Product> result1= products.stream()
        .filter(s-> s.stock>0)
        .map(s-> new Product(s.name,s.price,s.stock*2))
        .toList();
        
        result1.forEach(s-> System.out.println(s));
        
        System.out.println("\n\n");
        
         products.stream()
        .filter(s-> s.stock==0)
        .forEach(s-> s.stock=s.stock *2);
         
         System.out.println(products);
         
        
        
        
        
    }
 }