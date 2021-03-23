package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program3 {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2));
		myCircles.add(new Circle(3));
		
		System.out.println("Total area: " + totalArea(myCircles));
		
	}

	public static Double totalArea(List<? extends Shape> list) {
		double sum = 0;
		
		for (Shape s : list) {
			sum += s.area();
		}
		
		return sum;
	}
	
	
}
