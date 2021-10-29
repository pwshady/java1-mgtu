package ru.aniks.nested;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o = new Outer(10);
		Outer.Nested n = new Outer.Nested();
		n.increment(o);
		
		Outer.Inner i1 = o.new Inner();
		
		Outer.Inner i = o.new Inner();
		i.increment(o);
		
		System.out.println(o.getData());
		
		Invoice inv = new Invoice("PiK");
		inv.new Line("Roga", 10, 100);
		inv.new Line("Kop", 20, 40);
		
		System.out.println(inv);
	}

}
