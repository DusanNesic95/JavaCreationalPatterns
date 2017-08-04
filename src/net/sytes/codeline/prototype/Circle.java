package net.sytes.codeline.prototype;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("Method draw to be implemented for Circle!");
	}

}
