package week2;

class Student{
	private int age;
	private String name;
	
	
	public int getAge() {   //getter and setter
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation{
	public static void main(String[]args) {
		//int age=20;
		//String name="krishna";
		
		Student obj=new Student();
		obj.setAge(20);
		obj.setName("krishna");
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}
}