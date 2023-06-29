package com.project;

public class ProjectClass1 {
	public static void oddOrEven() {// add or even
		int num = 77;
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void oddNumber() { // add number b/n 1 to 100
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.print(" ");
				System.out.print(i);
			}
		}
	}

	public static void countOddNumber() { // count odd number b/n 1 to 100
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.print("\n" + count);
	}

	public static void sumOddNumber() {

		int sum = 0;

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 1) {
				sum = sum + i;

			}

		}

		System.out.println("\n" + sum);

	}

	public static void swapNum() { // swap two num using thrid value

		int a = 10, b = 20, c = 0;
		System.out.print("\nBefore Swap A = " + a);
		System.out.print("\tBefore Swap B= " + b);
		c = a;
		a = b;
		b = c;
		System.out.print("\tAfter Swap A= " + a);
		System.out.print("\tAfter Swap B= " + b);

	}

	public static void swapingNum() { // swap not using thrid number

		int a = 10, b = 20;
		System.out.print("\nBefore Swap1 A= " + a);
		System.out.print("\tBefore Swap1 B= " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("\tAfter Swap1 A= " + a);
		System.out.print("\tAfter Swap1 B= " + b);

	}

	public static void odd() {

		int num = 122, rem = 0, rev = 0, temp = num;
		while (num > 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		if (temp == rev) {

			System.out.println("Palindrome num");

		} else {
			System.out.println("Not Palindrome");
		}

	}

	public static void sumOfDigit() {

		int num = 456, rem = 0, sum = 0;

		while (num > 0) {

			rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		ProjectClass1.oddOrEven();
		ProjectClass1.oddNumber();
		ProjectClass1.countOddNumber();
		ProjectClass1.swapNum();
		ProjectClass1.swapingNum();
		ProjectClass1.sumOddNumber();
		ProjectClass1.odd();
		ProjectClass1.sumOfDigit();

	}

}
