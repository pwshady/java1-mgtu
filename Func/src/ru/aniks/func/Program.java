package ru.aniks.func;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("aaa", 11));
		persons.add(new Person("sss", 22));
		persons.add(new Person("ddd", 33));
		
		/*for(Person p : persons) {
			System.out.println(p);
		}
		
		persons.stream().forEach(System.out::println);
		*/
		
		persons.parallelStream().filter(p->p.age>=18).
			sequential().
			sorted((p1, p2)->p1.name.compareTo(p2.name)).
			map(p->p.name).
			forEach(System.out::println);
		
		Collections.sort(persons, (p1, p2)->p1.name.compareTo(p2.name));
		for(Person p : persons) {
			if (p.age >= 18) {
				System.out.println(p);
			}
		
		//persons.stream().filter(p->p.age>=18).forEach(System.out::println);
	}

	}

}
