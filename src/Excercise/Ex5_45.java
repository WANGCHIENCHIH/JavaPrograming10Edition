package Excercise;

import java.util.Scanner;
import java.lang.Math;

public class Ex5_45 {

	public static void main(String[] args) {
		/* 
		 * the deviation formula in book is  population deviation
		 */
		System.out.print("Input a number list seperated by space:");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String[] x = a.split(" ");
		System.out.printf("mean of list is:%f\n", countMean(x));
		System.out.printf("deviation of list is:%f\n", countDeviation(x, countMean(x)));
		input.close();
	}

	public static double countMean(String[] a) {

		double mean = 0.0, total = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += Double.valueOf(a[i]);
		}
		mean = total / a.length;
		return mean;
	}

	public static double countDeviation(String[] a, double mean) {
		double deviation = 0.0, total = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += Math.pow((Double.valueOf(a[i]) - mean), 2);
		}

		deviation = Math.sqrt((total / (a.length - 1)));
		return deviation;
	}

	public static double countMean(double[] nums) {

		double mean = 0.0, total = 0.0;
		for (double num : nums) {
			total += num;
		}
		mean = total / nums.length;
		return mean;
	}
	
	public static double countDeviation(double[] nums) {
		double deviation = 0.0, total = 0.0,mean=countMean(nums);
		for (double num : nums) {
			total += Math.pow(num - mean, 2);
		}

		deviation = Math.sqrt((total / (nums.length - 1)));
		return deviation;
	}

}
