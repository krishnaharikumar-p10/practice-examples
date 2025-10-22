package week3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		

		List< Integer> list= Arrays.asList(4,2,8,1,3,5,6,9);
	
        int s=list.stream()
        .filter(num -> ( num%2==0))
        .reduce(0,(a,b) -> a+b); // uses Binary operator
        
        System.out.println(s);
        
        Map<Integer,Integer> even=list.stream()
        .filter(n->n%2==0)
        .collect(Collectors.toMap(
        		n->n,
        		n->n*n
        		));

        System.out.println(even);
    

	}

}
