package Collections;

import java.util.*;

public class Collectionexample5{

	public static void main(String[] args) {
		
		ArrayList<String> arraylist=new ArrayList<>(Arrays.asList("Beagle","Pomeranian","Dachshund","Pomeranian","Chihuahua","Dachshund","Dachshund"));
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(String word:arraylist) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		for( Map.Entry<String, Integer> pair : map.entrySet()) {
			System.out.println("Key :" + pair.getKey()+", Value :"+pair.getValue());
		}
		
		System.out.println("\n\n");
		
		TreeMap<String,Integer> tmap=new TreeMap<>(map);
		
		for( Map.Entry<String, Integer> pair: tmap.entrySet()) {
			System.out.println("Key :"+pair.getKey()+ "Value: "+pair.getValue());
		}
		
		System.out.println("\n\n");
		
		List<Map.Entry<String,Integer>> list =new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		Comparator<Map.Entry<String,Integer>> comp = new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return  o1.getValue()- o2.getValue();
			}
			
		};
		Collections.sort(list,comp);  
		
		for( Map.Entry<String, Integer> pair : list) {
			System.out.println("Key :" + pair.getKey()+", Value :"+pair.getValue());
		}
		
	}

}
