package ru.aniks.io;

import java.io.*;
import java.nio.charset.Charset;

public class Program {
	
	public static final String fileName = "test.txt";

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File f = new File(fileName);
		
		if (!f.exists()) {
			f.createNewFile();
		}
		
		String dir = "dir";
		
		File d = new File(dir);
		
		File[] files = d.listFiles();
		
		for(File file : files) {
			FileInputStream fs = new FileInputStream(fileName);
			byte[] buf = new byte[1000];
			fs.read(buf);
			fs.close();
		}
		
		try(FileInputStream fs = new FileInputStream(fileName);
				BufferedReader reader = new BufferedReader(
				new InputStreamReader(fs, Charset.forName(fileName))))
		{
			String line = null;
			int lineCounter = 0;
			int charCounter = 0;
			int wordCounter = 0;
			
			while ((line = reader.readLine()) != null){
				System.out.println(line);
				lineCounter++;
				charCounter += line.length();
				wordCounter += line.split("\\s").length;
			}				
		}
		catch(Exception ex){			
		}
		
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream(fileName);
			PrintWriter writer = new PrintWriter(fos);
			writer.printf("aaa");
			writer.flush();
			writer.close();			
		}
		catch(Exception ex) 
		{
			
		}
		finally
		{
			if (fos != null) {
				fos.close();
			}
		}
		
		try(RandomAccessFile rnd = new RandomAccessFile(fileName,"rw"))
		{
			rnd.seek(0);
			System.out.println(rnd.length());
			rnd.close();
			
		}
		
	}

}
