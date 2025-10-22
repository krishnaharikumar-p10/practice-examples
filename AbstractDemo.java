package week3;

abstract class ab{
	
	public int num =8;
	
	abstract void show();
	
	static void stmethod() {
		System.out.println("inside the static method");
	}
	
	protected void pro() {
		System.out.println("inside protected method");
	}
	
}

class child extends ab{

	public void show() {
		System.out.println("showinggg...");
	}
	
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		child c=new child();
		c.pro();
		c.show();
		

	}

}

