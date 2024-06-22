package com.samul.javaсorelessons.testwork1;

public class Task8 {

	public static void main(String[] args) {
		double x = 0.1;
		double step = 0.1;
		
		while ((x <= 10) && (f(x) >= 0)) {
			System.out.printf("f(%.2f) = %.3f\n", x, f(x));
			x += step;
		}
	}
	
	public static double f(double x) {
		return x * x - Math.exp(2 *x) + 4;
	}

}
