package week2;

class Home<T>{
	
	public T data;
	private String name;
	
	Home(T data,String name){
		
		this.data=data;
		this.name=name;
	}
	

    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "name :" + name + " " + "data: " + data; 
	}

}

public class GenericExample {

	public static void main(String[] args) {
		
		Home<Integer> home1= new Home<>(897,"michael");
		System.out.println(home1);
		
		Home<String> home3= new Home<>("D293","taylor");
		System.out.println(home3);
		
	
	}
}