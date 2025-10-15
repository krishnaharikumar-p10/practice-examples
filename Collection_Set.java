package week2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {
	public static void main(String[] args) {
		
		
		System.out.println("HASHSET");
		
		Set<Integer> hashset=new HashSet<>();
		
		hashset.add(10);
		hashset.add(1);
		hashset.add(9);
		hashset.add(3);
		hashset.add(10);
		hashset.add(9);
		hashset.add(3);
		
		System.out.println(hashset); // no duplicate values, no order 
		Iterator<Integer> it= hashset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("TREESET");
		
		Set<String> treeset=new TreeSet<>();
		
		treeset.add("john");
		treeset.add("joshi");
		treeset.add("krishna");
		treeset.add("pooja");
		treeset.add("hevna");
		treeset.add("judith");
		treeset.add("navin");
		
		System.out.println(treeset);  // in alphabetical order
		
		for (String n: treeset) {
			System.out.println(n);
		}
		
		System.out.println("LINKEDHASHSET");
		
		Set<String> linkedset=new LinkedHashSet<>();
		
		linkedset.add("john");
		linkedset.add("joshi");
		linkedset.add("krishna");
		linkedset.add("pooja");
		linkedset.add("hevna");
		linkedset.add("judith");
		linkedset.add("navin");
		
		System.out.println(linkedset); // inserted order 
		
		for (String n: linkedset) {
			System.out.println(n);
		}
		
		
		
	}

}
