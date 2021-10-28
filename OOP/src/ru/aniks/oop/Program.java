package ru.aniks.oop;

import ru.aniks.stuff.Person;

public class Program {
	
	public static void main(String[] args) {
		Person p1 = new Person("aaa", 11);
		
		Person p2 = new Person("bbb", 222);
		
		p1.show();
		p2.show();
	}
}
