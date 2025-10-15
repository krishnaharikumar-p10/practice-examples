package week2;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		
		map.put("jake", 100);
		map.put("kris", 550);
		map.put("jo", 956);
		map.put("taylor", 124);
		
		System.out.println(map);
		
		map.put("taylor", 868);  // overwrites value of taylor, no duplicates
		System.out.println("Map :"+map);
		
		System.out.println("Value of key jo :"+map.get("jo"));
		
		System.out.println("Keys :"+map.keySet()); 
		
		System.out.println("Values :"+ map.values());
		
		System.out.println(map.containsKey("kris"));
		
		System.out.println(map.containsValue(65));
		
		map.replace("jake",450);
		System.out.println("After replacing the value of jake :"+map);
		
		map.putIfAbsent("maria",96);
		System.out.println(map);   
		
		map.remove("kris");
		System.out.println("After removing key kris :"+ map);
		
		for (String key: map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}
	

}
