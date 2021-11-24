package SelectControlStatement;

import java.util.Scanner;

public class Code_632 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int min = 0;

		if (num1 < num2 && num3 > num1) {
			min = num1;
		} else if (num2 < num3 && num1 > num2) {
			min = num2;
		} else if (num3 < num1 && num2 > num3) {
			min = num3;
		}
		System.out.println(min);

	}

}
