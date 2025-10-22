package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class Collectionexample4 {
    public static void main(String[] args) {
    	
    	HashMap<String,Integer> map=new HashMap<>();
    	
		map.put("jake", 100);
		map.put("kris", 550);
		map.put("jo", 956);
		map.put("taylor", 124);
		
		System.out.println(map.entrySet());
    	
		
		for( String key : map.keySet()) {
			System.out.println(key +"="+  map.get(key));
		}
		
		for( Map.Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println("key: "+ entry.getKey() +",value: "+entry.getValue());
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			entry.setValue(entry.getValue()+10);
			
		}
		System.out.println("updated: "+map.entrySet());
		
		
		Iterator<Map.Entry<String,Integer>> entry= map.entrySet().iterator();
		while(entry.hasNext()) {
			Map.Entry<String,Integer> pair=entry.next();
			if (pair.getKey()=="jake"){
					entry.remove();
			}
		}
		
		System.out.println("after removing : "+map.entrySet());
		
		
	}
  
}
