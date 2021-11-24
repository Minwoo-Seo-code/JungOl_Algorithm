package Operator;

import java.util.Scanner;

public class Code_113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt() + 5;
		int num2 = sc.nextInt() * 2;

		System.out.printf("width = %d%n", num1);
		System.out.printf("length = %d%n", num2);
		System.out.printf("area = %d%n", num1 * num2);
	}

}
