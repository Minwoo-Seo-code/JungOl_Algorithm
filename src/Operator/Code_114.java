package Operator;

import java.util.Scanner;

public class Code_114 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.print(++num1 + " ");
		System.out.println(num2--);

		System.out.printf("%d %d", num1, num2++);

	}

}
