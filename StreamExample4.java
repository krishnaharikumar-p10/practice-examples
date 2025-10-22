package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Participants {
    String name;
    int score;

    Participants(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getname() {
    	return name; 
    }
    
    public int getscore() {
    	return score; 
    	}
    
    @Override
    public String toString() {
        return name + " : " + score;
    }
}



public class StreamExample4 {

	public static void main(String[] args) {
		
        List<List<Participants>> participants = Arrays.asList(
                Arrays.asList(
                    new Participants("Alice", 45),
                    new Participants("Bob", 55)
                ),
                Arrays.asList(
                    new Participants("Charlie", 60),
                    new Participants("David", 40),
                    new Participants("Eve", 70)
                )
            );
        
        System.out.println(participants);
     
        List<Participants> passed=participants.stream()
        		.flatMap(p -> p.stream())
                .filter(p-> p.getscore()>=50)
                .map(p-> new Participants(p.getname(),p.getscore()+10))
                .sorted((s1,s2) -> s2.getscore()-s1.getscore())
                .collect(Collectors.toList());

                passed.forEach(System.out::println);
                
                System.out.println();

                List<String> names= passed.stream()
                		.map(s->s.getname())
                		.collect(Collectors.toList());
                
                System.out.println(names);
                	
                System.out.println();

                int add =passed.stream()
                		.map(s-> s.getscore())
                        .reduce( 0, (s1,s2) -> s1+s2);
                
                System.out.println(add);
 
        
	}

}
