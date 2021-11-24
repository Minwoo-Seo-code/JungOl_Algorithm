package Operator;

import java.util.Scanner;

public class Code_524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean boo1 = a != 0 && b != 0;
		boolean boo2 = a == 0 || b == 0;

		System.out.print(boo1 + " ");
		System.out.println(boo2);

	}
}
