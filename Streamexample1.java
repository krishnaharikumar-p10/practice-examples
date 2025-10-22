package week3;

import java.util.ArrayList;
import java.util.List;

class Stud{
	String name;
	int marks;
	
	Stud(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "Name: "+ name+ ", Marks: "+marks;
		
	}
}

public class Streamexample1 {

	public static void main(String[] args) {
		
		List<Stud> list = new ArrayList<>();
		
		list.add(new Stud("Jo",90));
		list.add(new Stud("Taylor",50));
		list.add(new Stud("Alex",85));
		
		list.stream()
				.filter(s -> s.marks >=50)
				.sorted((s1,s2) -> s1.marks-s2.marks)
				.map(s->
				{
					int m=s.marks;
					String grade;
					if(m>=90) grade = "A+";
					else if(m>=80 && m<90) grade= "A";
					else if(m>=70 && m<80) grade= "B+";
					else if(m>=60 && m<70) grade ="B";
					else grade= "C";
					return s.name+ " : "+grade;
					
				})
				.forEach(s-> System.out.println(s));
		
			
		
		
	}
}