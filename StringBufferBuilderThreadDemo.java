public class StringBufferBuilderThreadDemo {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();

        Thread t1= new Thread(()-> sbf.append("A"));
        Thread t2= new Thread(()-> sbf.append("B"));

        t1.start();
        t2.start();
        
        try {
        	t1.join();
	        t2.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
       
        
        System.out.println("StringBuffer: " + sbf);

        StringBuilder sbd = new StringBuilder();

        Thread t3 =new Thread(()-> sbd.append("A"));
        Thread t4 =new Thread(()-> sbd.append("B"));

        t3.start();
        t4.start();
        
        try {
        	t3.join();
	        t4.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
       

        System.out.println("StringBuilder: " + sbd);
    }
}
