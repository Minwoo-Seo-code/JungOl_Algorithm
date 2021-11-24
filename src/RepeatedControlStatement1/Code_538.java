package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_538 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("number? ");
		int input = sc.nextInt();

		for (int i = 0; i < 1000000; i++) {
			if (input > 0) {
				System.out.println("positive integer");
				System.out.print("number? ");
				input = sc.nextInt();
			} else if (input < 0) {
				System.out.println("negative number");
				System.out.print("number? ");
				input = sc.nextInt();
			} else {
				break;
			}
		}

	}
}
