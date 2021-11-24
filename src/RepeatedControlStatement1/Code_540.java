package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_540 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;

		do {
			num = sc.nextInt();
			if (num % 3 != 0) {
				continue;
			} else if (num % 3 == 0) {
				System.out.printf("%d%n", num / 3);
			}

		} while (num != -1);
	}

}
