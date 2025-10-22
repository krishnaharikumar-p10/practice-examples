package Collections;

import java.util.*;

public class Collectionexample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map1=new HashMap<String,Integer>();
		
		map1.put("taylor", 100);
		map1.put("alex", 80);
		
		HashMap<String, Integer> map2=new HashMap<String,Integer>();
		
		map1.put("nick", 40);
		map1.put("henry", 90);
		
		for(Map.Entry<String, Integer> pair: map2.entrySet()) {
			map1.put(pair.getKey(), pair.getValue());
		}
		
		System.out.println(map1);
		
		int max=0;
		for(Map.Entry<String, Integer> pair: map1.entrySet()) {
			if (pair.getValue()>max) {
				max= pair.getValue();
			}
			
		}
		
		System.out.println("MAXIMUM VALUE:"+max);
		
		HashMap<Integer, String> map3=new HashMap<Integer,String>();
		
		for(Map.Entry<String, Integer> pair: map1.entrySet()) {
			map3.put(pair.getValue(), pair.getKey());
		}
		
		System.out.println("Inverting a map: "+map3);
		
	}
	

}
