

public class testSingleton {
	public static void main(String[] args) {
	
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
	
	
}}		

class Singleton {
	
	//static  Singleton obj= new Singleton(); // eager instantiation.
	
	static Singleton obj;
	
	private Singleton() {
		System.out.println("instance created");
	}
	
	public static Singleton getInstance() {
		
		if ( obj == null) {
			synchronized (Singleton.class) {  // double checking lock
			if (obj==null) {
				obj= new Singleton();
			}
		    }
	    }
		return obj;
}
	
}