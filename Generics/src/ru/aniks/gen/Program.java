package ru.aniks.gen;

public class Program {

	public static <T extends Comparable<T>> boolean isGreater(T a, T b) {
		return a.compareTo(b) > 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadonlyStorage<Integer> r = new ReadonlyStorage<Integer>(10);
		ReadonlyStorage<?> r1 = new ReadonlyStorage<String>("abc");
		
		System.out.println(isGreater(10, 7));
		
		System.out.println(r.getData());
	}

}
