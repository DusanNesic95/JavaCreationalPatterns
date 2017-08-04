package net.sytes.codeline.main;

import java.util.Scanner;

import net.sytes.codeline.abstractfactory.AndroidSmsFactory;
import net.sytes.codeline.abstractfactory.IOSSmsFactory;
import net.sytes.codeline.abstractfactory.SmsFactory;
import net.sytes.codeline.abstractfactory.SmsMessage;

public class MainAbstractFactory {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SmsFactory smsFactory = null;
		
		String userChoice = "";
		Scanner userInput = new Scanner(System.in);
		System.out.println("Molim Vas odaberite operativin sistem za koji zelite klasu SmsMessage?");
		userChoice = userInput.nextLine();
		
		if (userChoice.toLowerCase().equals("android")) {
			smsFactory = new AndroidSmsFactory();
			SmsMessage message = smsFactory.buildMessage();
			message.sendMessage("me", "This is a test message!");
		} else if (userChoice.toLowerCase().equals("ios")) {
			smsFactory = new IOSSmsFactory();
			SmsMessage message = smsFactory.buildMessage();
			message.sendMessage("me", "This is a test message!");
		} else {
			throw new RuntimeException("You did not input a real mobile operating system!");
		}
		
		userInput.close();
	}
	
}
