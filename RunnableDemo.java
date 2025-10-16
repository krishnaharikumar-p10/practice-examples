
class  T implements Runnable{
	
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

class  Z implements Runnable{
	
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
public class RunnableDemo {

	public static void main(String[] args) {
		
		T obj=new T();
		Z obj1=new Z();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		System.out.println(t1.isAlive());   //thread 1 has not yet finished
		try {
			t1.join();                      // thread 2 executes only after thread 1 finishes
		} catch (InterruptedException e) {   
			e.printStackTrace();
		}
		System.out.println(t1.isAlive()); //thread 1 has  finished 
		
		t2.start();

	}
}
