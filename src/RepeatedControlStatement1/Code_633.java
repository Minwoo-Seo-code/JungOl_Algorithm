package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_633 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (true) {
			System.out.printf("1. %s%n2. %s%n3. %s%n4. %s%n%s ", "Korea", "USA", "Japan", "China", "number?");
			num = sc.nextInt();
			System.out.println();

			if (num == 1) {
				System.out.println("Seoul");
				System.out.println();
			} else if (num == 2) {
				System.out.println("Washington");
				System.out.println();
			} else if (num == 3) {
				System.out.println("Tokyo");
				System.out.println();
			} else if (num == 4) {
				System.out.println("Beijing");
				System.out.println();
			} else {
				System.out.println("none");
				break;
			}

		} // while end
	}

}
