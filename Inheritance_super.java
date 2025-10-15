package week2;

class x{
	String message="Message from superclass x";
	
	void method(){
		System.out.println("Inside class x");
	}
}

class y extends x{
	String message="Message from superclass y";
	void showvariable() {
		System.out.println(super.message);   //  showing superclass variable
	}
	void method(){// overrides
		super.method();// calling superclass method
		System.out.println("Inside class y");
	}
	
}

public class Inheritance_super {

	public static void main(String[] args) {
		y obj=new y();
		System.out.println(obj.message);
		obj. showvariable();
		obj.method();
	}

}
