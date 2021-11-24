package Operator;

import java.util.Scanner;

public class Code_523 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.printf("%d > %d --- %d%n", num1, num2, 1);
		} else {
			System.out.printf("%d > %d --- %d%n", num1, num2, 0);
		}

		if (num1 < num2) {
			System.out.printf("%d < %d --- %d%n", num1, num2, 1);
		} else {
			System.out.printf("%d < %d --- %d%n", num1, num2, 0);
		}
		if (num1 >= num2) {
			System.out.printf("%d >= %d --- %d%n", num1, num2, 1);
		} else {
			System.out.printf("%d >= %d --- %d%n", num1, num2, 0);
		}
		if (num1 <= num2) {
			System.out.printf("%d <= %d --- %d%n", num1, num2, 1);
		} else {
			System.out.printf("%d <= %d --- %d%n", num1, num2, 0);
		}
	}
}
