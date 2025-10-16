
import java.util.*;


class Data implements  Comparable<Data>{
	String name;
	int age;
	
	Data(String name , int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "name :" + name + " age :" + age;
	}

	@Override
	public int compareTo(Data that) {
		return this.name.compareTo(that.name);
	}
	
	
}

public class SortComparable {
    public static void main(String[] args) {
    	
    	List<Data> list = new ArrayList<>();
        list.add(new Data("Mike", 22));
        list.add(new Data("Taylor", 20));
        list.add(new Data("Alex", 25));
        
        System.out.println("Before sorting:");
        for (Data d: list) {
        	System.out.println(d);
        }
        
        Collections.sort(list);
        
        System.out.println("After sorting:");
        for (Data d: list) {
        	System.out.println(d);
        }
        
        
       
        
        
    }
}
