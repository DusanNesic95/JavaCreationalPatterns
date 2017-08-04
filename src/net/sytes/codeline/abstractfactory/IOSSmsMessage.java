package net.sytes.codeline.abstractfactory;

public class IOSSmsMessage implements SmsMessage {

	@Override
	public void sendMessage(String to, String text) {
		System.out.println("Logic for constructing and sending SMS message from iOS.");
		System.out.println("The message will be sent to: " + to);
		System.out.println("The content of the message will be: " + text);
	}

}
