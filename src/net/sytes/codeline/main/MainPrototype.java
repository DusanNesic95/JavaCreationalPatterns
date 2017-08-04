package net.sytes.codeline.main;

import net.sytes.codeline.prototype.Shape;
import net.sytes.codeline.prototype.ShapeCache;

public class MainPrototype {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("We have loaded the shape: " + clonedShape.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("We have loaded the shape: " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("We have loaded the shape: " + clonedShape3.getType());
	}
	
}
