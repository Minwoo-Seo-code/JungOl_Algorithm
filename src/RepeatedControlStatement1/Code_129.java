package RepeatedControlStatement1;

import java.util.Scanner;

public class Code_129 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int Base = 0;
		int Height = 0;
		double result = 0;
		String con = null;

		while (true) {
			System.out.print("Base = ");
			Base = scanner.nextInt();
			System.out.print("Height = ");
			Height = scanner.nextInt();
			result = (double) Base * Height / 2;

			System.out.printf("Triangle width = %.1f%n", result);
			System.out.printf("Continue? ");
			con = scanner.next();

			if (!(con.equals("Y") || con.equals("y"))) {
				break;
			}

		}

	}

}
