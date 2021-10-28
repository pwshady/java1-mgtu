package ru.aniks.gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static int getGcd(int a, int b) {
		int c = 0;
		/*if (b > a) {
			c = a;
			a = b;
			b = c;
		}*/
		for(;;) {
			c = a % b;
			if (c != 0) {
				a = b;
				b = c;
			}else {
				return b;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a: ");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("Enter b: ");
		int b = Integer.parseInt(reader.readLine());
		System.out.println(getGcd(a,b));
	}

}
