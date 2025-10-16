package week2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AgeException extends Exception{
	
	AgeException(String str){
		super(str);
	}
}

class Customers{
	private String name;
	private int age;
	Scanner scn=new Scanner(System.in);
	
	Customers(String name,int age) throws AgeException{
		this.name=name;
		setAge(age);

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age<18) {
			throw new AgeException("Sorry, You must be 18 or older");
		}
		this.age = age;
	}
}




class BankAccount extends Customers{
	
	private int balance;
	
	BankAccount(String name, int age , int balance) throws AgeException {
		
		super(name,age);
		this.balance=balance;	
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString(){
		return "Name :" + getName()+ " Age :"+ getAge()+ " Balance :" + getBalance();
	}
	
}


public class Demo {

	public static void main(String[] args) {
		
		List<BankAccount> accounts=new ArrayList<>();
		
		toAdd(accounts,"Emily",58,3600);
		toAdd(accounts,"Henry",36,26381);
		toAdd(accounts,"Nick",10,60000);
		toAdd(accounts,"Alex",29,86080);
		
		for(BankAccount h:accounts) {
			System.out.println(h);
		}
	}
		

	private static  void toAdd(List<BankAccount> accounts,String name,int age,int balance) {
		try { 
			accounts.add(new BankAccount(name,age,balance));
		}
		catch(AgeException e) {
			System.out.println( "Account of " + name+ " is not added "+e );
			
		}
	}

}
