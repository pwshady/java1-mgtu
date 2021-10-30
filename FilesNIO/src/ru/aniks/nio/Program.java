package ru.aniks.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {
	
	public static final String fileName = "test.txt";

	public static void main(String[] args) throws IOException {
	
		//Files.readAllLines(Paths.get("..", fileName)).forEach(System.out:: println);
		
		Path dir = Paths.get("..");
		Files.newDirectoryStream(dir).forEach(System.out::println);
		
	}

}
