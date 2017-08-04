package net.sytes.codeline.main;

import net.sytes.codeline.factorymethod.FederationStarship;
import net.sytes.codeline.factorymethod.KlingonStarship;
import net.sytes.codeline.factorymethod.Starship;

public class MainFactoryMethod {

	public static void main(String[] args) {
		Starship enterprise = new FederationStarship();
		System.out.println("Star battle ship is created: " + enterprise.toString());
		Starship birdOfPrey = new KlingonStarship();
		System.out.println("Star battle ship is created: " + birdOfPrey.toString());
	}
	
}
