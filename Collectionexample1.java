package Collections;
import java.util.*;

public class Collectionexample1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		List<Integer> arraylist=new ArrayList<>();
		System.out.println("Enter the elements of the list:");
		
		for(int i=0;i<5;i++) {
			int elements=scn.nextInt();
			arraylist.add(elements);
			
		}
		
		System.out.println("LIST : "+arraylist);
		
		TreeSet<Integer> ts=new TreeSet<>(arraylist);

		System.out.println("Remove duplicates: "+ ts);
		
		System.out.println("Descending : "+ ts.descendingSet());
		
		
		int sum=0;
		for(Integer n: ts) {
			sum=sum+n;	
		}
		
		
		System.out.println("Sum: "+sum);
		
	}

}
