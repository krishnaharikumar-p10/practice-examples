package week3;

import java.util.Optional;

public class Optional1 {
	public static Optional<String> getMiddleName(String fullName) {
		
	String[] ar= fullName.split(" ");
	if ( ar.length==3) {
		return Optional.of(ar[1]);
	}else {
		return Optional.empty();
	}	
	}
	public static void main(String[] args) {
		
		Optional<String> str=  Optional.of("hi");
		Optional<Integer> n =Optional.empty();
		
		//if (str.isPresent()) {
			//System.out.println(str.get());
		//}else {
			
		//	System.out.println("no");
		//}
		
		//str.ifPresent(s-> System.out.println(s));
		
		Optional<Integer> opt = Optional.ofNullable(null);
		
		Integer result1= opt.orElse(10);
		System.out.println(result1);
		
		Integer result2= opt.orElseGet(()-> 20);
		System.out.println(result2);
		
		//Integer result3= opt.orElseThrow();
		//System.out.println(result2);
		
		Optional<Integer> op = Optional.ofNullable(20);
		
		Optional<Integer> finalresult= op.filter((x->x>30));
		
		if(finalresult.isPresent()){
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		Optional<String> name = Optional.ofNullable(null);
		
		String s=name
		.map(nm-> nm.toUpperCase())
		.orElse("none");
		System.out.println(s);
	
		
		System.out.println( getMiddleName("krishna hari kumar").orElse("na"));
		System.out.println( getMiddleName("krishna kumar").orElse("no middle name"));
		
		Optional<String> opt1=Optional.ofNullable("hi");
		Optional<String> opt2=Optional.ofNullable(null);
		
		String check=opt1
				.or(()-> opt2)
				.orElse("none");

	}
	

}
