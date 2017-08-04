package net.sytes.codeline.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}
	
	@Override
	public void draw() {
		System.out.println("Method draw to be implemented for Rectangle!");
	}

}
