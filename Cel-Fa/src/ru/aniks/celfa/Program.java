package ru.aniks.celfa;

import java.io.InputStreamReader;
import java.util.Locale;
import java.io.BufferedReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException{
		//Locale.setDefault(Locale.US);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter cel: ");
		String cel_str = reader.readLine();
		double cel = Double.parseDouble(cel_str);
		double fa = (cel * (9d / 5d)) + 32d;
		System.out.printf(/*Locale.US, */"Fa: %.2f \n", fa);
	}

}
