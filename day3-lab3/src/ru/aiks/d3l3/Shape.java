package ru.aiks.d3l3;

import java.util.ArrayList;

public class Shape 
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
	
	public void draw() 
	{
		System.out.printf("Shape color: %s\n", color);
	}
}
