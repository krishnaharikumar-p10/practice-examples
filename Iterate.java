package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		 
		List<Integer> arraylist=new ArrayList<>(Arrays.asList(1,5,7,3,2));
		
		System.out.println("For-each loop");
		for(int n: arraylist) {
			System.out.println(n);
		}
		
		System.out.println("\n");
		
		System.out.println("forEach");
		arraylist.forEach(System.out::println);
		
		System.out.println("\n");
		
		System.out.println("For loop");
		for( Integer  i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println("\n");
		
		System.out.println("Iterartor");
		Iterator<Integer> it=  arraylist.iterator();
		while(it.hasNext()) {
			int n=it.next();
			if (n==3) {
				it.remove();
			}
		}
		System.out.println(arraylist);
		
		
	}

}
