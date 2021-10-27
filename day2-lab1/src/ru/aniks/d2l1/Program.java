package ru.aniks.d2l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> names = new ArrayList<String>();
		
		for(;;) {
			System.out.println("Enter name: ");
			String name = reader.readLine();
			if (name.equals("")){
				break;
				}
			else {
				names.add(name);
			}
		}
		Collections.sort(names);
		System.out.println("================");
		for(String name : names) {
			System.out.println(name);
		}
		

	}

}
