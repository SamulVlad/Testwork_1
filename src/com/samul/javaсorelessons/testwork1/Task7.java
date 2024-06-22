package com.samul.javaсorelessons.testwork1;

public class Task7 {

	public static void main(String[] args) {
		int n = 7, m = 10;
		double x0 = 20, z0 = 3;
		double hX = 0.3, hZ = 0.5;
		double[][] mas = new double[n + 1][m + 1];

		// в нулевой столбец загоняем x
		for (int i = 1; i <= n; i++) {
			mas[i][0] = x0;
			x0 += hX;
		}

		// в нулевую строку загоняем z, чтобы потом не передавать лишние параметры в print
		// и сделать красивую табличку
		for (int j = 1; j <= m; j++) {
			mas[0][j] = z0;
			z0 += hZ;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				mas[i][j] = f(mas[i][0], mas[0][j]);
			}
		}

		printMas(mas);

	}

	public static double f(double x, double z) {
		double y;

		y = Math.sqrt(z * z + x * x) * Math.log(z);
		y += Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
		return y;
	}

	public static void printMas(double[][] param) {

		for (int j = 0; j < param[0].length; j++) {
			if (j != 0) {
				System.out.printf("%7.2f", param[0][j]);
			} else {
				System.out.print("       ");
			}
		}
		
		StringBuilder line = new StringBuilder("\n        ");
		for (int j = 1; j < param[0].length; j++) {
			line.append("_______");
		}
		System.out.println(line);

		for (int i = 1; i < param.length; i++) {
			System.out.printf("%5.2f  |", param[i][0]);
			for (int j = 1; j < param[0].length; j++) {
				System.out.printf("[%5.2f]", param[i][j]);
			}
			System.out.println();

		}

	}
}
