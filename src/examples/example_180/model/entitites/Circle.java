package examples.example_180.model.entitites;

import examples.example_180.model.enums.Color;

public class Circle extends AbstractShape
{
	public Double radius;
	
	public Circle(Color color, Double radius)
	{
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius()
	{
		return radius;
	}
	
	public void setRadius(Double radius)
	{
		this.radius = radius;
	}
	
	public double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}
}
