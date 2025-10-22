package week3;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Stream1 {

	public static void main(String[] args) {


		List< Integer> list= Arrays.asList(2,6,7,9,1);
		
		Predicate<Integer> check1 = new Predicate<Integer>(){   // implmenting FI using anonymous class

			@Override
			public boolean test(Integer num) {
				
				return num%2==0;

			}};
		System.out.println(check1.test(6));
		System.out.println("\n");

		Predicate<Integer> check2 = num -> ( num%2==0);

        System.out.println(check2.test(6));
        
        
        list.stream()
        .filter(num -> ( num%2==0))
        .forEach(System.out:: println);
        
        
		System.out.println("\n");

        Function<Integer,Integer> func= new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer n) {
				
				return n*n;
			}
        	
        };
        
        System.out.println( func.apply(8));

        
        
        Function<Integer,Integer> func1= n -> n*n;
     
        System.out.println( func1.apply(9)); 
        
        list.stream()
        .map(n -> n*n)
        .forEach(System.out::println);
        
        
		System.out.println("\n");

        Consumer<Integer> cons= new Consumer<Integer> () {

			@Override
			public void accept(Integer n) {
				System.out.println(n);
			}
        	
        };
        
        cons.accept(100);
        
        Consumer<Integer> cons1= n ->System.out.println(n);

        cons1.accept(1000);
        
        list.stream()
        .map(n -> n*n)
        .forEach(s->System.out.println(s));
        
        
		System.out.println("\n");

	        
        List<List<Integer>> listOfLists = Arrays.asList(
        	    Arrays.asList(1, 2),
        	    Arrays.asList(3, 4)
        	);
        System.out.println(listOfLists);
        
        	listOfLists.stream()
        	           .map(l -> l.stream())      // Stream<Stream<Integer>>
        	           .forEach(s->System.out.println(s));

        	
        	listOfLists.stream()
        	           .flatMap(l -> l.stream())  // Stream<Integer>
        	           .forEach(System.out::println);

        
        
        
        
    }
}