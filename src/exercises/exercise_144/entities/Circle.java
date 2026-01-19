package exercises.exercise_144.entities;

public class Circle extends Shape
{
	public Double radius;
	
	public Circle()
	{
	
	}
	
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
