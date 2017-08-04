package net.sytes.codeline.prototype;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Method draw to be implemented for Square!");
	}

}
