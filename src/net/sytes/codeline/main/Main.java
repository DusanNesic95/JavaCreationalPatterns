package net.sytes.codeline.main;

import net.sytes.codeline.builder.Sandwich;

public class Main {

	public static void main(String[] args) {
		Sandwich.SandwichBuilder builder = new Sandwich.SandwichBuilder();
		
		builder
		.bread("Beli hleb")
		.condements("Paprika")
		.extras("Majonez")
		.meat("Riba");
		
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich);
	}
	
}
