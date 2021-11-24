package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_539 {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		int input = 0;

		Scanner sc = new Scanner(System.in);

		do {

			input = sc.nextInt();
			sum += input;
			count++;

		} while (input != 100);

		float avg = (float) sum / count;

		System.out.println(sum);
		System.out.printf("%.1f", avg);

	}
}