package ru.aniks.stuff;

public class Person {
	
	public static int counter = 0;
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		counter++;
	}
	
	public void show()
	{
		System.out.printf("%s - %d\n", this.name, this.age);
	}

}
