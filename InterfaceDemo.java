package week3;

@FunctionalInterface
interface it{
	String var1="krishna";
	
	default void method(){
		System.out.println("inside default method");
		pvt();
	}	
	
	static void stmethod() {
		System.out.println("inside static method");
	}
	
	void show();
	
	private void pvt(){
		System.out.println("inside private method");
	}
}


class A implements it{

	public void show() {
		System.out.println("implemented");
		
	}	
	
}


public class InterfaceDemo {
	public static void main(String[] args) {
		
		
		it.stmethod();
		A obj= new A();
        obj.method();
		
		
		
	}
}
