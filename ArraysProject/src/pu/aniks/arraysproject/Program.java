package pu.aniks.arraysproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> person = new ArrayList<String>();
		System.out.println(person.size());
		person.set(0, "aaa");
		person.remove(0);
		for(int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i));
		}
		
		Iterator<String> iter = person.iterator();
		while (iter.hasNext()) {
			String p = iter.next();
			System.out.println(p);
		}
		
		Collections.sort(person);
		
		for(String p: person) {
			System.out.println(p);
		}
		
		List<String> up = Collections.unmodifiableList(person);
	}

}
