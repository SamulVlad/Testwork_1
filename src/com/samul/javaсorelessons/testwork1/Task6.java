package com.samul.javaсorelessons.testwork1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		Integer[] funcArgs = new Integer[20];
		Double[] funcRes = new Double[20];
		int countNotValid = 0;
		
		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4;
		
		funcArgs = fillArgsByRandom();
		funcRes = f(funcArgs);

		for (int i = 0; i < 20; i++) {
			if (isValid(funcRes[i], a, b, m)) {
				System.out.printf("[%d]\tf(%d)=%.2f\n", i + 1, funcArgs[i], funcRes[i]);
			} else {
				countNotValid++;
			}
		}
		
		System.out.println("Количество элементов не удовлетворяющих условиям: " + countNotValid);

	}

	public static Integer[] fillArgsByRandom() {
		List<Integer> args = new ArrayList<>();
		Random rnd = new Random();

		while (args.size() < 20) {
			int nextRnd = rnd.nextInt(90) - 30;
			if (!args.contains(nextRnd)) {
				args.add(nextRnd);
			}
		}
			
		args.sort(null);
		
		return args.toArray(new Integer[0]);

	}

	public static Double[] f(Integer[] funcArgs) {
		Double[] y = new Double[funcArgs.length];

		for (int i = 0; i < funcArgs.length; i++) {
			y[i] = Math.pow(funcArgs[i], 3) - 25 * Math.pow(funcArgs[i], 2) + 50 * funcArgs[i] + 1000;
		}

		return y;
	}

	public static boolean isValid(double param, double a, double b, double m) {
		boolean result;

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		result = ((param >= t1 && param <= t2) || (param >= t3 && param <= t4));

		return result;
	}

}
