package ru.aiks.d3l3;

import java.util.ArrayList;

public abstract class Shape 
{
	public static final String DEFAULT_COLOR = "black";
	public static ArrayList<Shape> scene = new ArrayList<Shape>();
	
	public String color;	
	
	public Shape() 
	{
		this(DEFAULT_COLOR);
	}

	public Shape(String color) 
	{
		this.color = color;
		scene.add(this);
	}
	
	public static void drawScene()
	{
		for (Shape s : scene) {
			s.draw();
		}
	}
	
	public static void scaleScene(double factor)
	{
		for (Shape s : scene) {
			if (s instanceof Scaleable) {
				Scaleable sc = (Scaleable)s;
				sc.scale(factor);
			}
			//s.scale(factor);
		}
	}
	
	public abstract void draw(); 
	//{
	//	System.out.printf("Shape color: %s\n", color);
	//}
}
