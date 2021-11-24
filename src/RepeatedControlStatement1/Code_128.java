package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_128 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = 0;
		int count = 0;
		while (true) {

			num = scanner.nextInt();

			if (num == 0) {
				break;
			}
			if (!(num % 3 == 0 || num % 5 == 0)) {
				count++;
			}

		}
		System.out.println(count);
	}
}
