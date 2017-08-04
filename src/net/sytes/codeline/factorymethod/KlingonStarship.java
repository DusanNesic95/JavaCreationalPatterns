package net.sytes.codeline.factorymethod;

public class KlingonStarship extends Starship {

	public KlingonStarship() {
		super();
		makeStarship();
	}
	
	@Override
	protected void makeStarship() {
		this.setSpeed("Warp7");
		this.setSize(19);
		this.setCrewSize(120);
		this.setName("Bird of prey");
		this.setType("Klingon");
	}

}
