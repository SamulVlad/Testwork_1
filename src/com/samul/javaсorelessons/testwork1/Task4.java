package com.samul.javaсorelessons.testwork1;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		int n = 10;
		double[][] points = new double[2][n];

		generatePointsByRandom(points);
		printPointsArray(points);
		System.out.println("\nКоличество точек внутри области:" + solution(points));

	}

	public static void generatePointsByRandom(double[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param[0].length; i++) {
			param[0][i] = rnd.nextDouble(6) - 3;
			param[1][i] = rnd.nextDouble(6) - 3;
		}
	}

	public static int solution(double[][] param) {
		int count = 0;
		for (int j = 0; j < param[0].length; j++) {
			if (isInArea(param[0][j], param[1][j])) {
				count++;
			}
		}

		return count;
	}

	public static boolean isInArea(double x, double y) {
		boolean result;

		result = ((x >= 0 && x <= 2 && y >= -1 && y <= 1) || (x >= -2 && x <= 0 && y >= 0 && y <= 2));

		return result;
	}

	public static void printPointsArray(double[][] param) {

		for (int i = 0; i < param[0].length; i++) {
			System.out.printf("[%.1f;%.1f]", param[0][i], param[1][i]);
		}

	}


}
