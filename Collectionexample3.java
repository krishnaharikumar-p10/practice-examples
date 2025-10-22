package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class Collectionexample3 {

	public static void main(String[] args) {
		
		System.out.println("enter line:");
		Scanner scn = new Scanner(System.in);
		String line=scn.nextLine();
		String[] ar=line.split(" ");
		
		HashSet<String> set= new HashSet<>();

		for( String word: ar) {
			set.add(word);
		}
		System.out.println(set);
		
		StringBuilder sb= new StringBuilder();
		for(String word :set) {
			StringBuilder copy= new StringBuilder(word).reverse();
			sb.append(copy).append(" ");
			
		}
		
		System.out.println(sb);
		
		int count =0;
		for(String str: set) {
			for( int i=0; i< str.length();i++) {
				char c= str.charAt(i);
				if( (c=='i') ||(c=='e')||(c=='a') ||(c=='o')||(c=='u')) {
					count=count+1;
				}
			}
		}
		System.out.println("VOWELS:"+count);
		
	}
	}

