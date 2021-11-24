package Operator;

import java.util.Scanner;

public class Code_521 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.printf("%d %d %d", num1 + 1, --num2, num1++ * num2);
	}
}
