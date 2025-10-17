package week2;

public class StringDemo {
    public static void main(String[] args) {
        

        String firstName = "Taylor";
        String secondName = "Taylor";
        String thirdName = new String("Taylor");
        
        System.out.println("Comparing string literals with : " + (firstName == secondName));
        
        System.out.println("Comparing literal and new String object : " + (thirdName == secondName));
        
        System.out.println("Comparing content with equals(): " + thirdName.equals(secondName));
        
    
        String s7 = "Java";
        String s8 = s7;
        s7 = s7 + " Programming";
        System.out.println("s7 after concatenation: " + s7);
        System.out.println("s8 : " + s8);
        
        // String Methods
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Programming";
        String s4 = "   Java  ";
        
        System.out.println("Length of s1: " + s1.length());
        
        System.out.println("Character at index 1: " + s1.charAt(1));
        
        System.out.println("Substring(1,5): " + s3.substring(1,5));
        
        System.out.println("To Upper Case: " + s1.toUpperCase());
        
        System.out.println("To Lower Case: " + s1.toLowerCase());
        
        System.out.println("Trimmed s4: '" + s4.trim() + "'");
        
        System.out.println("s1 equals s2: " + s1.equals(s2));
        
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        
        System.out.println("s1 contains 'ell': " + s1.contains("va"));
        
        System.out.println("Replace j with v in s1: " + s1.replace("v","j"));
        
        

        String s6 = s1.concat(s3);  
        System.out.println("Using concat(): " + s6);
    }
}
