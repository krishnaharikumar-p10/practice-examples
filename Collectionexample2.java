package Collections;
import java.util.*;

public class Collectionexample2 {
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		HashSet<String> s=new HashSet<>();
		
		System.out.println("Enter 5 strings:");
		for( int i=0; i< 5;i++) {
			String item=scn.next();
			s.add(item);
		}
		
		System.out.println(s);
		
		HashSet<String> uppers= new HashSet();
		for(String item :s) {
			uppers.add(item.toUpperCase());
		}	
		
		s.clear();
		s.addAll(uppers);
		System.out.println(s);
		
		String word="car";
		if(s.contains(word) ) {
				System.out.println("yes");
	     }else {
				System.out.println("no");
			}
		}
		
		 
 }
	
