package exercise_144.application;

import exercise_144.entities.Circle;
import exercise_144.entities.Color;
import exercise_144.entities.Rectangle;
import exercise_144.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
	static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r')
			{
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(color, width, height));
			}
			else if(ch == 'c')
			{
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : shapes)
		{
			System.out.printf("%.2f%n", shape.area());
		}
		
		sc.close();
	}
}
