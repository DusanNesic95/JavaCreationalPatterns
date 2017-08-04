package net.sytes.codeline.factorymethod;

public class FederationStarship extends Starship {

	public FederationStarship() {
		super();
		makeStarship();
	}

	@Override
	protected void makeStarship() {
		this.setSpeed("Warp10");
		this.setSize(20);
		this.setCrewSize(120);
		this.setName("U.S.S Enterprise");
		this.setType("Federation");
	}

}
