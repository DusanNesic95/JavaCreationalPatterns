package net.sytes.codeline.factorymethod;

public abstract class Starship {

	private String speed;
	private int size;
	private int crewSize;
	private String name;
	private String type;

	public Starship() {}
	
	protected abstract void makeStarship();
	
	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCrewSize() {
		return crewSize;
	}

	public void setCrewSize(int crewSize) {
		this.crewSize = crewSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Starship [speed=" + speed + ", size=" + size + ", crewSize=" + crewSize + ", name=" + name + ", type="
				+ type + "]";
	}
	
}
