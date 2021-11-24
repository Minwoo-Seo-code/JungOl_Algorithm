package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_127 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int input = 0;
		int sum = 0;
		double avg = 0.0;
		int count = 0;

		while (true) {
			input = scanner.nextInt();

			if (input > 100 || 0 > input) {
				break;
			}
			sum += input;
			count++;
		}
		avg = (double) sum / count;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);

	}

}
