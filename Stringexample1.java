package week2;
import java.util.*;

public class Stringexample1 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter the first string");
		String string1=scn.next();

		System.out.println("Enter the second string");
		String string2=scn.next();
		
		
		if(string1.equalsIgnoreCase(string2)){
			System.out.println("They are equal (ignoring case)");
		}else {
			System.out.println("They are not equal");
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(string1);
		
		StringBuilder demo=sb;
		
		System.out.println(sb);
	    System.out.println(demo);
		
		sb.append(" ");
		sb.append(string2);
		
		System.out.println(sb);
		System.out.println(demo);  // gets modified
		
			
	    String concatstring= sb.toString();
	    
		String reversedstring= sb.reverse().toString();
		
		System.out.println("Original strings: " + string1 +" , "+string2);
		System.out.println("Concatenated string: " + concatstring);
		System.out.println("Reversed string: " + reversedstring);
		System.out.println("Length of the oncatenated string: " + reversedstring.length());


		if(concatstring.contains("car")) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

		
		
		
		scn.close();
		
		
		

	}

}
