package ru.aniks.nested;

public class Outer {
	

	public static class Nested
	{
	
		void increment(Outer o) 
		{
			o.data++;
		}
	
	}
	
	public class Inner
	{
	
		void increment(Outer o) 
		{
			data++;
		}
	
	}
	
	private int data;
	
	public Outer(int data) 
	{
		this.data = data;
	}
	
	public int getData() 
	{
		return data;
	}
	
	/*public boolean isGreater(int x) 
	{
		int k = -1;
		/*class MyComparator{
			public int compare(int a, int b) {
				return a + k - b;
			}
		}
		
		MyComparator c = new MyComparator();
		return c.compare(data, x) > 0;

		Comparator<Integer> c = new Comparator<Integer>() 
		{
			public int compare(Integer a, Integer b) 
			{
				return a + k + b;
			}
		}
	}*/
	

}
