package Debug;

import java.util.Scanner;

public class Code_117 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double result1 = sc.nextDouble();
		double result2 = sc.nextDouble();
		double result3 = sc.nextDouble();

		result1 = (int) result1;
		result2 = (int) result2;
		result3 = (int) result3;

		System.out.printf("sum %.0f%n", result1 + result2 + result3);
		System.out.printf("avg %.0f", (result1 + result2 + result3) / 3);

	}

}
