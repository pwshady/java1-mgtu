package ru.aiks.d3l3;

public class Point extends Shape
{

	public int x;
	public int y;
	
	public Point()
	{
		super();
	}
	
	public Point(int x, int y, String color) 
	{
		super(color);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() 
	{
		System.out.printf("Point (%d,%d), color: %s", this.x,this.y, this.color);
	}
	
	@Override
	public String toString() {
		return String.format("Point (%d,%d), color: %s", this.x,this.y, this.color);
	}
	
	@Override
	public Point clone()
	{
		return new Point(this.x, this.y, this.color);
	}
	
	public void moveBy(int dx, int dy) 
	{
		this.x += dx;
		this.y += dy;
	}
}
