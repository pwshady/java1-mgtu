package ru.aniks.ex;

import static java.lang.System.out;

public class Program {
	
	public static void test(String a, String b) {
		try {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);
			
			if (n1 < 0 || n1 > 100) {
				//throw new IllegalArgumentException("My Ex");
				throw new MyException("ex", n1);
			}
		
			int n = n1/n2;
			out.println(n);
		}
		catch(NumberFormatException ex) 
		{
			out.println("No number");
		}
		catch(MyException ex) 
		{
			out.println(ex.getInvalidData());
		}
		catch(Exception ex) {
			out.println("My ex");
		}
		finally {
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test("123","3");

	}

}
