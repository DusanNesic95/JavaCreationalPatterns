package net.sytes.codeline.abstractfactory;

public class IOSSmsFactory implements SmsFactory {

	@Override
	public SmsMessage buildMessage() {
		System.err.println("Constructing new iOS SMS message.");
		return new IOSSmsMessage();
	}

}
