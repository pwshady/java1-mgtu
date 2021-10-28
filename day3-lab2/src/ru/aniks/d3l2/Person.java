package ru.aniks.d3l2;

import java.util.ArrayList;

public class Person {

	public static int counter = 0;
	public static ArrayList<Person> persons = new ArrayList<Person>();
	public String name;
	public int age;
	
	public static void showAll() {
		for (Person p : persons)
		//for(int i = 0; i < persons.size(); i++) {
			//System.out.printf("%s - %d\n", persons.get(i).name, persons.get(i).age);
			p.show();
		//}
	}
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
		counter++;
		//persons.add(this);
	}
	
	public static Person create(String name, int age) 
	{
		Person p = new Person(name, age);
		persons.add(p);
		return p;
	}
	
	public void show()
	{
		System.out.printf("%s - %d\n", this.name, this.age);
	}
	
}
