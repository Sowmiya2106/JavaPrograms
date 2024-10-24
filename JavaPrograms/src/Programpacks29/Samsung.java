package Programpacks29;

public class Samsung implements Phone {
	
	@Override
	public void call() {
		System.out.println("Calling using sumsung");
	}
	
	@Override
	public void sms() {
		System.out.println("Messaging using Samnung");
	}

}
