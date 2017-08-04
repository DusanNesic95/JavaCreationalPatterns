package net.sytes.codeline.abstractfactory;

public class AndroidSmsMessage implements SmsMessage {

	@Override
	public void sendMessage(String to, String text) {
		System.out.println("Logic for constructing and sending SMS message from Android.");
		System.out.println("The message will be sent to: " + to);
		System.out.println("The content of the message will be: " + text);
	}

}
