package com.samul.javaсorelessons.testwork1;

public class Task5 {

	public static void main(String[] args) {
		int n = 20;
		double a = 1, x1 = -2 * a, dX = a / 5;

		double[][] res = new double[2][n];

		for (int i = 0; i < n; i++) {
			res[0][i] = x1;
			res[1][i] = f(a, x1);

			x1 += dX;
		}

		print(res);

	}

	public static double f(double a, double x) {
		double y;


		if (x <= 0) {
			if (a == 0) {
				System.out.println("Выражение не может быть вичислено. Значение в знаменателе дроби равно 0.");
				return 0;
			}
			y = a / 2 * (Math.exp(x / a) + Math.exp(-x / a));
		} else {
			y = 4 * Math.pow(a, 3) / (x * x + 4 * a * a);
		}

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
