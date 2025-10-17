package week2;

public class StringBufferExample {

	public static void main(String[] args) {
	
		
		StringBuffer sb= new StringBuffer("hello");
		
		System.out.println(sb.capacity());
		sb.append("hellohellohellohellohello");   //(21*2)+2
		System.out.println(sb.capacity());
		
		
		StringBuffer sb1= new StringBuffer("hello");
		System.out.println(sb1==sb);
		
		String str="hello";
		
		System.out.println(sb1.equals(str));  //false because sb1 is a stringbuffer even if content are same
		
		String str1=sb1.toString();
		
		System.out.println(str1.equals(str)); 
		
		System.out.println(str1==str);  
		
		

		StringBuffer sbf= new StringBuffer("taylor");
		
		System.out.println(sbf.append(" alex"));
		
		System.out.println(sbf.charAt(5));
		
		System.out.println(sbf.insert(6, " zakhar"));
		
		System.out.println(sbf.deleteCharAt(6));
		
		System.out.println(sbf.delete(6, 12));
		
		System.out.println(sbf.reverse());
		
		System.out.println(sbf.compareTo(sb1));
		
		System.out.println(sbf.reverse());
		
		System.out.println(sbf.replace(6, 7, "Perez"));
		
		System.out.println(sbf.substring(6, 11));
		
		System.out.println(sbf.length());
		
		
	}

}
