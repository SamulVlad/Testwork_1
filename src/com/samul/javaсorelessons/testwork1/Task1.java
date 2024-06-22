package com.samul.javaсorelessons.testwork1;

public class Task1 {

	public static void main(String[] args) {
		double x = 0.5;
		double y;

		if (x + 2 / 3 == 0) {
			System.out.println("Выражение не может быть вичислено. Значение в знаменателе дроби равно 0.");
			return;
		}

		y = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3))) + 1.7;
		
		System.out.println("y = " + y);

	}

}
