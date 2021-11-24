package SelectControlStatement;

import java.util.Scanner;

public class Code_529 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int weight = sc.nextInt();
		int obesity = weight + 100 - height;

		if (obesity > 0) {
			System.out.printf("%d%n%s", obesity, "Obesity");
		} else {
			System.out.println(obesity);
		}

	}

}
