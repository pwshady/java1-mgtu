package ru.aniks.integral;

public class Program {
	
	public static final int STEPS = 10000000;
	
	public static double integral(func f, double a, double b) {
		double h = (b-a)/STEPS;
		double summ = 0d;
		
		for(int i = 0; i < STEPS; i++) {
			double x = a + i*h + h/2;
			double y = f.myFunc(x);
					//Math.sin(x);
			summ += y * h;
		}
		return summ;
	}
	
	public static void main(String[] args) {	
		//1.    double r1 = integral(Math::sin, 0, Math.PI/2);
		long l1 = System.currentTimeMillis();
		class SinFunc implements func{
			public double myFunc(double x) {
				return Math.sin(x);
			}			
		}
		
		func f = new SinFunc();
		//double r1 = integral(0, Math.PI/2);
		double r1 = integral(f, 0, Math.PI/2);
		long l2 = System.currentTimeMillis();
		System.out.println(r1);
		System.out.println(l2-l1);
	}

}
