package week2;

class  T extends Thread{  	
	@Override
	public void run() { 
		for(int i=1 ;i<=5;i++) {
			System.out.println("THREAD 1");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {  //thread 1 waits for 10 milliseconds
				e.printStackTrace();
			}
		}
}	
}

class  Z extends Thread{
	
	@Override
	public void run() { 
		for(int i=1 ;i<=5;i++) {
			System.out.println("THREAD 2");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}	
}
public class ThreadExample {

	public static void main(String[] args) {
		
		T obj=new T();
		Z obj1=new Z();
		
		obj.setPriority(Thread.MAX_PRIORITY);// priority set to 10 ; depends upon the scheduler 
		
		obj.start();
		obj1.start();

	}

}
