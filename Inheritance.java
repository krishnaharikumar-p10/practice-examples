package week2;

class calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}

class advcalculator extends calculator {   //inherits calculator 
		public int mult(int a,int b) {
			return a*b;
		}
		public int divi(int a,int b) {
			return a/b;
		}
}

class newadvcalculator extends advcalculator{  //inherits advcalculator
	public double pow(int a,int b) {
		return Math.pow(a,b);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		newadvcalculator obj=new newadvcalculator();
		int r1=obj.add(3,4);
		int r2=obj.sub(3,4);
		int r3=obj.mult(3,4);
		int r4=obj.divi(3,4);
		double r5=obj.pow(2, 2);
		System.out.println(r1+":"+r2+":"+r3+":"+r4+":"+r5);

	}

}
