package week2;


class CustomException extends Exception {
	CustomException(String str){
		super(str);
	}
	
}

public class ExceptionHandling {

	public static void main(String[] args) {
		int i=30;
		int j=0;
		String str="computer";
		try {
			j=20/i;
			if (j==0) {
				throw new CustomException("j is zero,throwing custom exception ");
			}
			char c=str.charAt(9);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index is out " + e);
		}
		catch(CustomException e) {
			j=2; // default value
			System.out.println( e );
		}
		catch( ArithmeticException e) {
			j=1;
			System.out.println("Arithmetic error: using default value " + e);
		}
		catch( Exception e) {
			System.out.println("Some error occured " + e);
		}
		finally {
			System.out.println("Execution finished");
		}
		System.out.println(j);
		
	}

}


