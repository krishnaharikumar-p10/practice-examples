package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collectionexample6 {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		ArrayList<Integer> arraylist=new ArrayList<>();
		System.out.println("Enter the elements of the list:");
		
		for(int i=0;i<5;i++) {
			Integer elements=scn.nextInt();
			arraylist.add(elements);
		}
		
		for(int i=0;i<5;i++) {
			arraylist.set(i, arraylist.get(i)*2);
		}
		System.out.println(arraylist);
		
		Collections.sort(arraylist);
		
		System.out.println(arraylist);
		
		System.out.println("second largest: "+arraylist.get(arraylist.size()-2));
		
		
		//or
		
		Integer largest= Integer.MIN_VALUE;
		Integer secondlargest= Integer.MIN_VALUE;
		
		for(int i=0 ; i< arraylist.size();i++) {
			Integer num=arraylist.get(i);
			if (num> largest) {
				secondlargest=largest;
				largest=num;
			}
			else if((num>secondlargest) &&(num!=largest)){
				secondlargest= num;
			}
		}
		System.out.println("second largest: "+secondlargest);
		
		System.out.println("Minimum :" +Collections.min(arraylist));
		
		
	}
	
}
