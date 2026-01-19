package examples.example_180.application;

import examples.example_180.model.entitites.AbstractShape;
import examples.example_180.model.entitites.Circle;
import examples.example_180.model.entitites.Rectangle;
import examples.example_180.model.enums.Color;

public class Program
{
	static void main(String[] args)
	{
		AbstractShape circle = new Circle(Color.BLACK, 2.0);
		AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + circle.getColor());
		System.out.println("Circle area: " + String.format("%.3f", circle.area()));
		System.out.println("Rectangle color: " + rectangle.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", rectangle.area()));
	}
}
