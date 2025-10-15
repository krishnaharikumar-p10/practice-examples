package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Collection_List {
	public static void main(String[] args) {
		
		int[] array= new int[3];
		array[0]=2;
		array[1]=3;
		array[2]=9;
		
		
		//System.out.println(array[0]);
		//array[1]=100;
		//System.out.println(array[1]);
		
		//System.out.println(array); //memory address
		//for (int i=0; i<array.length;i++) {
			//System.out.println(array[i]);
		//}
		
		//ArrayList / LinkedList
		
		List<String> arraylist1=new ArrayList<>();
		
		ArrayList<String> arraylist=new ArrayList<>(Arrays.asList("Java","C++"));
		
		System.out.println(arraylist);
				
		arraylist.add("Python");
		arraylist.add("C");
		System.out.println("After adding:" +arraylist); //adding two more elements
		
		arraylist.remove("C++");
		System.out.println("After removing C++:"+arraylist); //removing an element
		
		arraylist.set(1,"JavaScript");  
		System.out.println("After updating:" +arraylist);
		
		System.out.println("Element at index 1 :"+arraylist.get(1));  //to access
		
		arraylist.add(2,"HTML");    
		System.out.println("Adding new element in between :"+arraylist);
		
		System.out.println("Index of Java : "+arraylist.indexOf("Java"));

		System.out.println("Size of the arraylist :"+arraylist.size()); //finding the size of the arraylist
		
		
		System.out.println(arraylist.contains("C"));
		
		System.out.println(arraylist.isEmpty());
		
		for (String n:arraylist) {
			System.out.print ("\n"+n);
		}
		
		
		
		
		
		
		
	}

}
