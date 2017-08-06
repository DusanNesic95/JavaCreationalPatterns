package net.sytes.codeline.main;

import net.sytes.codeline.singleton.Singleton;

public class MainSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println("Bajt kod objekta je: " + singleton);
		
		Singleton secondInstance = Singleton.getInstance();
		System.out.println("Baj kod drugog objekta je: " + secondInstance);
		
		System.out.println("Objekti 'sinleton' i 'secondInstance' su identicni, odnosno pokazuju na isti objekat!");
		
		if (singleton.equals(secondInstance)) {
			System.out.println("Objekti su identicni!");
		} else {
			System.out.println("Objekti nisu identicni!");
		}
	}
	
}
