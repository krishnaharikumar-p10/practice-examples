package week2;

class division{
	int performdivision() throws ArithmeticException {
		return divide(20,30);
		}
	
	int divide(int n1,int n2) throws ArithmeticException {
		return n1/n2;
			
	 }
}


public class Exceptionthrows {

	public static void main(String[] args) {
		division obj=new division();
		int result=0;
		try {
			result=obj.performdivision();
			if (result==0){
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e) {
			result=20/1; // setting a default value for result
			System.out.println("This is just a default value");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println(result);
	}
}