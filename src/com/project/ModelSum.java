package com.project;

public class ModelSum {
	public static void main(String[] args) {
		int num = 234569, sum = 0, rem = 0, rem1 = 0, sum1 = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
		while (sum > 0) {
			rem1 = sum % 10;
			sum1 = sum1 + rem1;
			sum = sum / 10;
		}
		System.out.println(sum1);
		int sum2 = 0, rem2 = 0;
		while (sum1 > 0) {
			rem2 = sum1 % 10;
			sum2 = sum2 + rem2;
			sum1 = sum1 / 10;
		}
		System.out.println(sum2);
	}
}
