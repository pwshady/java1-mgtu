package ru.aiks.d3l3;

public class Circle extends Point{
	
	public int rad;
	
	public Circle() 
	{
		
	}
	
	public Circle(int rad) 
	{
		this.rad = rad;
	}
	
	public Circle(int x, int y, int rad, String color)
	{
		super(x, y, color);
		this.rad = rad;
	}
	
	public void scale(double sc)
	{
		this.rad = (int)(sc*this.rad);
		
	}
	
	@Override
	public String toString() {
		return String.format("Circle center:(%d,%d), radius: %f color: %s", this.x,this.y, this.rad, this.color);
	}
	
	@Override
	public Circle clone()
	{
		return new Circle(this.x, this.y, this.rad, this.color);
	}
	
	@Override
	public void draw() 
	{
		System.out.printf("Circle center:(%d,%d), radius: %d color: %s", this.x,this.y, this.rad, this.color);
	}
}
