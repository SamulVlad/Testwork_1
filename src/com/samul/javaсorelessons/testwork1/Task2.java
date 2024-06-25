package com.samul.javaсorelessons.testwork1;

public class Task2 {

	public static void main(String[] args) {
		double a = 0.5, b = 1.0;
		int n = 10;
		double[][] res = new double[2][n];

		double step = (b - a) / (n - 1);

		for (int i = 0; i < n; i++) {
			double x = a + i * step;
			res[0][i] = x;
			res[1][i] = f(x);
		}

		print(res);

	}

	public static double f(double x) {
		double y;

		if (x + 2.0 / 3 == 0) {
			System.out.println("Выражение не может быть вичислено. Значение в знаменателе дроби равно 0.");
			return 0;
		}

		y = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3))) + 1.7;

		return y;
	}

	public static void print(double[][] mas) {

		System.out.print("------------------------------");
		System.out.printf("\n|%-3s|%-12s|%-12s|", "№", "x", "f(x)");
		System.out.print("\n------------------------------");
		for (int j = 0; j < mas[0].length; j++) {
			System.out.printf("\n|%-3s|%-12.6f|%-12.6f|", String.valueOf(j + 1) + ".", mas[0][j], mas[1][j]);
		}
		System.out.println("\n------------------------------");

	}

}
