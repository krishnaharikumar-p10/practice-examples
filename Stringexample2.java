package week2;
import java.util.*;

public class Stringexample2 {
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the first string");
		String string1=scn.next();

		System.out.println("Enter the second string");
		String string2=scn.next();
		
		System.out.println("Enter the third string");
		String string3=scn.next();
		
		if(string1.length()>string2.length() & (string1.length()>string3.length())){
			System.out.println("Longest is :" + string1);
		}
		else if(string2.length()>string1.length() & (string2.length()>string3.length())) {
			System.out.println("Longest is :" + string2);
		}
		else {
			System.out.println("Longest is :" + string3);
		}
		
		StringBuffer sb= new StringBuffer();
		sb.append(string1).append(" ").append(string2).append(" ").append(string3);
		
		String concat= sb.toString();
		
		System.out.println("Concatenated string :" + concat);
		
		String upperstring= concat.toUpperCase();
		System.out.println("Uppercase : " + upperstring);
		
		String finalstring=upperstring.replaceAll(" ", "_");
		System.out.println("Replacing the spaces with underscore :" + finalstring);
		
		System.out.println("Enter the word");
		String word=scn.next();
		if (finalstring.startsWith(word)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	
		scn.close();
	}
}
	
