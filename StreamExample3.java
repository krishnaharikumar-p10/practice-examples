package week3;

import java.util.*;
import java.util.stream.*;

class Product1 {
    String name;
    double price;
    int stock;

    Product1(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return "Name : "+ name + ", Price : "+price + ",Stock : "+stock;
    }
}

public class StreamExample3 {
    public static void main(String[] args) {
        List<Product1> products = new ArrayList<>(); 
        
        products.add(new Product1("Laptop", 1200, 5));
        products.add(new Product1("Mouse", 25, 0));
        products.add(new Product1("Keyboard", 80, 10));
        products.add(new Product1("Monitor", 200, 3));
        
        
        products.stream()
        .filter(s-> s.stock> 0)
        .forEach(s-> s.stock =s.stock*2);// updates the list
        
        
    }
    
 }