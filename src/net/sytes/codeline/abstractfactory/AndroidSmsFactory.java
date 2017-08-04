package net.sytes.codeline.abstractfactory;

public class AndroidSmsFactory implements SmsFactory {

	@Override
	public SmsMessage buildMessage() {
		System.err.println("Constructing new Android SMS message.");
		return new AndroidSmsMessage();
	}

}
