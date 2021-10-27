package ru.aniks.io;

/*import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
*/
import java.util.Scanner;

public class Program {

	public static void main(String[] args) //throws IOException 
	{
		// TODO Auto-generated method stub
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Whot is you name? ");
		String name = reader.readLine();
		System.out.println("How old are you? ");
		String age_str = reader.readLine();
		int age = Integer.parseInt(age_str);
		System.out.println(age);
		*/
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if (sc.hasNextLine()) { 
			sc.nextLine();
			}
		sc.close();
	}

}
