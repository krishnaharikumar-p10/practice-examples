
interface Notification {
	void notifyuser();
}

class emailNotification implements Notification{

	@Override
	public void notifyuser() {
		System.out.println("sending email to user ");
		
	}
	
}

class  smsNotification implements Notification{

	@Override
	public void notifyuser() {
		System.out.println("sending sms to user ");
		
	}
	
}

class Factory{
	
	public static Notification createobject(String type) {
		
		if (type.equals("email")){
			return new emailNotification();
		}else if (type.equals("sms")) {
			return new smsNotification();
		}
		else {return null;}
		
	}		
}

public class testFactory {

	public static void main(String[] args) {
		Notification notification = Factory.createobject("sms");
		notification.notifyuser();
	}
}
