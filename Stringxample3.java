package week2;

import java.util.Scanner;

public class Stringxample3 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the first string");
		String string1=scn.next();

		System.out.println("Enter the second string");
		String string2=scn.next();
		
		for(int i=0; i<string1.length();i++) {
			for (int j=0; j< string2.length();j++) {
				if( string1.charAt(i)== string2.charAt(j)) {
					System.out.print(string1.charAt(i) + " ");
					break;
				}
			}

		}
		System.out.println();
		System.out.println(string1.replaceAll("[aeiou]", "*"));
		
		System.out.println("Enter the word");
		String word=scn.next();
		if(string2.endsWith(word)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if(string1.equalsIgnoreCase(string2)) {
			System.out.println("They are equal (ignoring case)");
		}else {
			System.out.println("They are not equal");
		}
		
		System.out.println("Length Difference: " + (string1.length() - string2.length()));
		scn.close();
	}
}
